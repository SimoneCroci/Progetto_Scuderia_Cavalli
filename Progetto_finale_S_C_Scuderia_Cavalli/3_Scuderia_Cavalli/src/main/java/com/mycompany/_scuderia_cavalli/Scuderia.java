package com.mycompany._scuderia_cavalli;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneOccupata;
import eccezioni.EccezionePosizioneVuota;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Rappresenta una scuderia che gestisce cavalli e fantini.
 */
public class Scuderia {
    private Cavallo[] cavalli;
    private Fantino[] fantini;
    private int nCavalli;
    private int nFantini;
    private String nome;
    private String sede;
    private int annoFondazione;
    static final int N_MAX_CAVALLI = 30;
    static final int N_MAX_FANTINI = 30;

    /**
     * Costruttore della classe Scuderia.
     *
     * @param annoFondazione l'anno di fondazione della scuderia
     * @param nome           il nome della scuderia
     * @param sede           la sede della scuderia
     */
    public Scuderia(int annoFondazione, String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
        this.annoFondazione = annoFondazione;
        cavalli = new Cavallo[N_MAX_CAVALLI];
        fantini = new Fantino[N_MAX_FANTINI];
    }

    // Metodi getter e setter

    // Metodi per la gestione dei cavalli

    /**
     * Restituisce il nome della scuderia.
     *
     * @return il nome della scuderia
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome della scuderia.
     *
     * @param nome il nuovo nome della scuderia
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce la sede della scuderia.
     *
     * @return la sede della scuderia
     */
    public String getSede() {
        return sede;
    }

    /**
     * Imposta la sede della scuderia.
     *
     * @param sede la nuova sede della scuderia
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * Restituisce l'anno di fondazione della scuderia.
     *
     * @return l'anno di fondazione della scuderia
     */
    public int getAnnoFondazione() {
        return annoFondazione;
    }

    /**
     * Imposta l'anno di fondazione della scuderia.
     *
     * @param annoFondazione il nuovo anno di fondazione della scuderia
     */
    public void setAnnoFondazione(int annoFondazione) {
        this.annoFondazione = annoFondazione;
    }

    /**
     * Restituisce il numero di cavalli presenti nella scuderia.
     *
     * @return il numero di cavalli presenti
     */
    public int getNCavalli() {
        return nCavalli;
    }

    /**
     * Imposta il numero di cavalli presenti nella scuderia.
     *
     * @param nCavalli il nuovo numero di cavalli presenti
     */
    public void setNCavalli(int nCavalli) {
        this.nCavalli = nCavalli;
    }

    /**
     * Restituisce il numero di fantini presenti nella scuderia.
     *
     * @return il numero di fantini presenti
     */
    public int getNFantini() {
        return nFantini;
    }

    /**
     * Imposta il numero di fantini presenti nella scuderia.
     *
     * @param nFantini il nuovo numero di fantini presenti
     */
    public void setNFantini(int nFantini) {
        this.nFantini = nFantini;
    }

    /**
     * Rimuove il cavallo dalla posizione specificata.
     *
     * @param posizione la posizione del cavallo da rimuovere
     * @throws EccezionePosizioneNonValida se la posizione non è valida
     * @throws EccezionePosizioneVuota     se la posizione è vuota
     */
    public void rimuoviCavallo(int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneVuota {
        if (posizione < 0 || posizione >= N_MAX_CAVALLI) {
            throw new EccezionePosizioneNonValida();
        }
        if (cavalli[posizione] == null) {
            throw new EccezionePosizioneVuota();
        }
        cavalli[posizione] = null;
    }

    // Altri metodi per la gestione dei fantini

    // Altri metodi per la gestione dei cavalli

    /**
     * Aggiunge un cavallo alla posizione specificata.
     *
     * @param cavallo   il cavallo da aggiungere
     * @param posizione la posizione in cui aggiungere il cavallo
     * @throws EccezionePosizioneNonValida se la posizione non è valida
     * @throws EccezionePosizioneOccupata  se la posizione è già occupata
     */
    public void aggiungiCavallo(Cavallo cavallo, int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata {
        if (posizione < 0 || posizione >= N_MAX_CAVALLI) {
            throw new EccezionePosizioneNonValida();
        }
        if (cavalli[posizione] != null) {
            throw new EccezionePosizioneOccupata();
        }
        cavalli[posizione] = cavallo;
    }

    // Altri metodi per la gestione dei fantini

    // Altri metodi per la gestione dei cavalli

    /**
     * Mostra i nomi dei cavalli presenti nella scuderia.
     */
    public void mostraNomiCavalli() {
        for (Cavallo cavallo : cavalli) {
            if (cavallo != null) {
                System.out.println(cavallo.getNomeCavallo());
            }
        }
    }

    // Altri metodi per la gestione dei fantini

    /**
     * Mostra l'elenco dei fantini ordinati alfabeticamente per nome.
     */
    public void mostraElencoFantiniOrdinati() {
        Fantino[] fantiniOrdinati = new Fantino[N_MAX_FANTINI];
        int index = 0;
        for (Fantino fantino : fantini) {
            if (fantino != null) {
                fantiniOrdinati[index++] = fantino;
            }
        }
        Arrays.sort(fantiniOrdinati, Comparator.comparing(Fantino::getNomeFantino));
        for (Fantino fantino : fantiniOrdinati) {
            if (fantino != null) {
                System.out.println(fantino.getNomeFantino());
            }
        }
    }

    // Altri metodi per la gestione dei cavalli

    /**
     * Restituisce un array contenente i cavalli della scuderia.
     *
     * @return un array di oggetti Cavallo
     */
    public Cavallo[] getCavalli() {
        return cavalli;
    }

    /**
     * Restituisce un array di stringhe contenente i nomi dei cavalli della scuderia ordinati alfabeticamente.
     *
     * @return un array di stringhe con i nomi dei cavalli ordinati
     */
    public String[] elencoNomiCavalliOrdinatiAlfabeticamente() {
        String[] nomiCavalli = new String[nCavalli];
        int index = 0;
        for (Cavallo cavallo : cavalli) {
            if (cavallo != null) {
                nomiCavalli[index++] = cavallo.getNomeCavallo();
            }
        }
        Arrays.sort(nomiCavalli);
        return nomiCavalli;
    }
    
 /**
 * Restituisce il cavallo corrispondente al numero specificato.
 *
 * @param numeroCavallo il numero del cavallo da recuperare
 * @return il cavallo corrispondente al numero specificato, o null se non presente
 */
public Cavallo getCavallo(int numeroCavallo) {
    if (numeroCavallo < 0 || numeroCavallo >= N_MAX_CAVALLI) {
        return null;
    }
    return cavalli[numeroCavallo];
}
}
