package com.mycompany._scuderia_cavalli;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneOccupata;
import eccezioni.EccezionePosizioneVuota;
import eccezioni.EccezioneScuderiaNonValida;
import eccezioni.FileException;
import utilita.ConsoleInput;
import utilita.Menu;
import utilita.TextFile;
import java.io.*;

/**
 * Applicazione per la gestione di una scuderia di cavalli.
 */
public class App {
    
    // Dichiarazione della variabile numeroCavallo all'inizio del metodo main
    private static int numeroCavallo;

    /**
     * Il metodo principale dell'applicazione.
     *
     * @param args gli argomenti passati da linea di comando
     * @throws EccezionePosizioneNonValida se la posizione specificata non è valida
     * @throws EccezionePosizioneOccupata se la posizione specificata è già occupata
     * @throws FileException se si verifica un'eccezione legata ai file
     * @throws IOException se si verifica un errore di I/O
     */
    public static void main(String[] args) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata, FileException, IOException {
        // Creazione di una nuova istanza della Scuderia
        Scuderia s1 = new Scuderia(2000, "scuderiaFiamma", "urbino");

        // Inizializzazione delle variabili per il menu
        int numeroVociMenu = 11;
        String[] vociMenu = new String[numeroVociMenu];
        int voceMenuScelta;
        Menu menu;

        // Inizializzazione dell'oggetto per l'input da console
        ConsoleInput tastiera = new ConsoleInput();

        // Dichiarazione delle variabili per la gestione dei dati dei cavalli
        String nomeCavallo;
        int etaCavallo;
        String razzaCavallo;
        double altezzaCavallo;
        int numeroFantino;
        int numeroScuderia;
        String nomeFileCSV = "scuderia.csv";
        String nomeFileBinario = "scuderia.bin";
        Cavallo c;
        String[] elencoNomiCavallo = null;

        // Definizione delle voci del menu
        vociMenu[0] = "0 -->\tEsci";
        vociMenu[1] = "1 -->\tVisualizza tutti i cavalli della scuderia";
        vociMenu[2] = "2 -->\tAggiungi cavallo";
        vociMenu[3] = "3 -->\tCerca cavallo";
        vociMenu[4] = "4 -->\tElimina cavallo";
        vociMenu[5] = "5 -->\tMostra nomi cavalli di una scuderia";
        vociMenu[6] = "6 -->\tMostra elenco dei fantini presenti ordinato alfabeticamente per ogni scuderia";
        vociMenu[7] = "7 -->\tEsporta scuderia in formato CSV";
        vociMenu[8] = "8 -->\tImporta scuderia da file CSV";
        vociMenu[9] = "9 -->\tSalva dati scuderia";
        vociMenu[10] = "10 -->\tCarica dati scuderia";
        menu = new Menu(vociMenu);

        // Loop principale del programma
        do {
            voceMenuScelta = menu.sceltaMenu(); // Visualizza il menu e ottiene la scelta dell'utente
            switch (voceMenuScelta) {
                case 0: // Esci
                    System.out.println("Arrivederci");
                    break;
                case 1: // Visualizza tutti i cavalli della scuderia
                    Cavallo[] elencoCavalli = s1.getCavalli();
                    boolean cavalliPresenti = false;
                    for (Cavallo cavallo : elencoCavalli) {
                        if (cavallo != null) {
                            System.out.println(cavallo);
                            cavalliPresenti = true;
                        }
                    }
                    if (!cavalliPresenti) {
                        System.out.println("Nessun cavallo presente nella scuderia.");
                    }
                    break;
                case 2: // Aggiungi cavallo
                    try {
                        // Ottieni i dettagli del cavallo da aggiungere
                        System.out.println("Nome Cavallo --> ");
                        nomeCavallo = tastiera.readString();
                        System.out.println("Eta Cavallo --> ");
                        etaCavallo = tastiera.readInt();
                        System.out.println("Razza Cavallo --> ");
                        razzaCavallo = tastiera.readString();
                        System.out.println("Altezza Cavallo --> ");
                        altezzaCavallo = tastiera.readDouble();

                        // Ottieni il numero della scuderia e del fantino
                        do {
                            try {
                                System.out.println("Scuderia (0..5) --> ");
                                numeroScuderia = tastiera.readInt();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Formato non corretto");
                            }
                        } while (true);

                        do {
                            try {
                                System.out.println("Fantino (0..29) --> ");
                                numeroFantino = tastiera.readInt();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Formato non corretto");
                            }
                        } while (true);

                        // Crea un nuovo cavallo e lo aggiungi alla scuderia
                        c = new Cavallo(nomeCavallo, etaCavallo, razzaCavallo, altezzaCavallo);
                        s1.aggiungiCavallo(c, numeroScuderia);
                        System.out.println("Cavallo inserito correttamente.");
                    } catch (IOException ex) {
                        System.out.println("Errore. Impossibile leggere da tastiera.");
                    } catch (EccezionePosizioneNonValida ex) {
                        System.out.println("Posizione non valida!");
                    } catch (EccezionePosizioneOccupata ex) {
                        System.out.println("Posizione occupata!");
                    }
                    break;
                case 3: // Cerca cavallo
                    boolean inputCorretto = false;
                    Cavallo cavalloTrovato = null;
                    do {
                        try {
                            System.out.println("Numero del cavallo (0..29) --> ");
                            numeroCavallo = tastiera.readInt();
                            if (numeroCavallo >= 0 && numeroCavallo < 30) {
                                inputCorretto = true;
                                cavalloTrovato = s1.getCavallo(numeroCavallo);
                                if (cavalloTrovato != null) {
                                    System.out.println(cavalloTrovato);
                                } else {
                                    System.out.println("Cavallo non trovato.");
                                }
                            } else {
                                System.out.println("Numero non valido. Inserire un numero compreso tra 0 e 29.");
                            }
                        } catch (IOException e) {
                            System.out.println("Errore. Impossibile leggere da tastiera");
                            tastiera.clearBuffer(); // Pulisce il buffer di input
                        } catch (NumberFormatException e) {
                            System.out.println("Formato non corretto. Inserire un numero valido.");
                            tastiera.clearBuffer(); // Pulisce il buffer di input
                        }
                    } while (!inputCorretto);
                    break;

                case 4: // Rimuovi cavallo
                    try {
                        // Ottieni il numero del cavallo da rimuovere e rimuovilo dalla scuderia
                        System.out.println("Numero del cavallo da rimuovere (0..29) --> ");
                        numeroCavallo = tastiera.readInt();
                        s1.rimuoviCavallo(numeroCavallo);
                        System.out.println("Il cavallo è stato rimosso correttamente");
                    } catch (IOException e) {
                        System.out.println("Errore durante la lettura da tastiera");
                    } catch (EccezionePosizioneNonValida ex) {
                        System.out.println("Posizione non valida");
                    } catch (EccezionePosizioneVuota ex) {
                        System.out.println("La posizione è già vuota. Nessun cavallo è stato rimosso");
                    }
                    break;
                case 5: // Mostra nomi cavalli di una scuderia
                    try {
                        // Ottieni il numero della scuderia e mostra i nomi dei cavalli in essa presenti
                        System.out.println("Numero della scuderia (0..5) --> ");
                        numeroScuderia = tastiera.readInt();
                        if (numeroScuderia < 0 || numeroScuderia > 5) {
                            System.out.println("Numero scuderia non valido. Inserire un numero compreso tra 0 e 5.");
                            break;
                        }
                        if (elencoNomiCavallo != null) {
                            for (String nome : elencoNomiCavallo) {
                                System.out.println(nome);
                            }
                        } else {
                            System.out.println("Nessun cavallo presente per la scuderia scelta.");
                        }
                    } catch (IOException e) {
                        System.out.println("Errore durante la lettura da tastiera");
                    } catch (NumberFormatException e) {
                        System.out.println("Formato non corretto. Inserire un numero valido per la scuderia.");
                    }
                    break;
                case 6: // Mostra elenco dei fantini presenti ordinato alfabeticamente per ogni scuderia
                    // Controlla se sono stati aggiunti fantini
                    if (s1.getNFantini() == 0) {
                        System.out.println("Non sono stati aggiunti fantini.");
                    } else {
                        // Ottieni e visualizza l'elenco dei nomi dei cavalli ordinati per scuderia
                        elencoNomiCavallo = s1.elencoNomiCavalliOrdinatiAlfabeticamente();
                        for (String nome : elencoNomiCavallo) {
                            System.out.println(nome);
                        }
                    }
                    break;

                case 7: // Esporta scuderia in formato CSV
    // Verifica se ci sono cavalli nella scuderia
    if (s1.getNCavalli() == 0) {
        System.out.println("Non ci sono cavalli nella scuderia.");
    } else {
        // Altrimenti, esporta la scuderia in formato CSV
        // Aggiungi qui la logica per esportare la scuderia in formato CSV
    }
    break;
         
   case 8: // Importa scuderia da file CSV
    // Verifica se il file CSV esiste
    File file = new File(nomeFileCSV);
    if (!file.exists()) {
        System.out.println("Il file CSV specificato non esiste.");
        break;
    }

    try {
        // Leggi un file CSV e importa i dati della scuderia
        TextFile fileCSV = new TextFile(nomeFileCSV, 'R');
        String rigaLetta;
        while ((rigaLetta = fileCSV.fromFile()) != null) {
            String[] datiCavallo = rigaLetta.split(";");
            // Verifica se ci sono abbastanza elementi nella riga
            if (datiCavallo.length < 5) {
                System.out.println("Errore nel formato dei dati nel file CSV: dati insufficienti.");
                continue; // Passa alla prossima riga
            }
            // Utilizza direttamente i valori senza dichiarare nuove variabili
            s1.aggiungiCavallo(new Cavallo(datiCavallo[0], Integer.parseInt(datiCavallo[1]), datiCavallo[2], Double.parseDouble(datiCavallo[3])), Integer.parseInt(datiCavallo[4]));
        }
        fileCSV.closeFile();
        System.out.println("Importazione da file CSV completata con successo.");
    } catch (IOException e) {
        System.out.println("Errore durante l'accesso al file.");
    } catch (NumberFormatException e) {
        System.out.println("Errore nel formato dei dati nel file CSV.");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Errore nel numero di campi nel file CSV.");
    }
    break;

                case 9: // Salva dati scuderia
                    try {
                        // Salva i dati della scuderia su file binario
                        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(nomeFileBinario));
                        writer.writeObject(s1);
                        writer.flush();
                        writer.close();
                        System.out.println("Salvataggio avvenuto correttamente");
                    } catch (IOException ex) {
                        System.out.println("Impossibile accedere al file");
                    }
                    break;
                case 10: // Carica dati scuderia
                    try {
                        // Carica i dati della scuderia da file binario
                        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(nomeFileBinario));
                        s1 = (Scuderia) reader.readObject();
                        reader.close();
                        System.out.println("Caricamento effettuato correttamente");
                    } catch (IOException ex) {
                        System.out.println("Impossibile accedere al file");
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Impossibile leggere il dato memorizzato");
                    }
                    break;
            }
        } while (voceMenuScelta != 0); // Continua fino a quando l'utente non sceglie di uscire
    }
}
