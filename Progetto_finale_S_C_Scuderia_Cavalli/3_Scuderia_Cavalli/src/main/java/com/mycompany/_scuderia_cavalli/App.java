package com.mycompany._scuderia_cavalli;

import eccezioni.FileException;
import java.io.*;
import java.util.Scanner;
import utilita.Menu;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inizializzazione dei dati
        Cavallo[] listaCavalli = new Cavallo[30];
        Fantino[] listaFantini = new Fantino[30];
        Scuderia[] listaScuderie = new Scuderia[6];
        
        // Loop del menu
        boolean continuaMenu = true; 
        while (continuaMenu) { 
            try {
                System.out.println("\nMENU:");
                System.out.println("0--> Aggiungi cavallo");
                System.out.println("1--> Aggiungi fantino");
                System.out.println("2--> Aggiungi scuderia");
                System.out.println("3--> Visualizza lista di cavalli");
                System.out.println("4--> Visualizza lista di fantini");
                System.out.println("5--> Visualizza lista di scuderie");
                System.out.println("6--> Salva in formato CSV");
                System.out.println("7--> Salva in formato binario");
                System.out.println("8--> Ordina cavalli per nome");
                System.out.println("9--> Ordina fantini per nome");
                System.out.println("10--> Ordina scuderie per nome fantino");
                System.out.println("11--> Esci");
                System.out.print("Scelta --> ");

                int scelta = Integer.parseInt(scanner.nextLine());
                switch (scelta) {
                    case 0:
                        listaCavalli = aggiungiCavallo(listaCavalli, scanner);
                        break;
                    case 1:
                        listaFantini = aggiungiFantino(listaFantini, scanner);
                        break;
                    case 2:
                        listaScuderie = aggiungiScuderia(listaScuderie, listaFantini, scanner);
                        break;
                    case 3:
                        visualizzaListaCavalli(listaCavalli);
                        continuaMenu=false;
                        break;
                    case 4:
                        visualizzaListaFantini(listaFantini);
                        break;
                    case 5:
                        visualizzaListaScuderie(listaScuderie);
                        break;
                    case 6:
                        System.out.print("Nome file CSV: ");
                        String csvFile = scanner.nextLine();
                        salvaCSV(listaCavalli, listaFantini, listaScuderie, csvFile);
                        break;
                    case 7:
                        System.out.print("Nome file binario: ");
                        String binFile = scanner.nextLine();
                        salvaBinario(listaCavalli, listaFantini, listaScuderie, binFile);
                        break;
                    case 8:
                        ordinaCavalliPerNome(listaCavalli);
                        break;
                    case 9:
                        ordinaFantiniPerNome(listaFantini);
                        break;
                    case 10:
                        ordinaScuderiePerNomeFantino(listaScuderie);
                        break;
                    case 11:
                        continuaMenu = false; // Impostiamo continuaMenu a false per uscire dal loop
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserire un numero corretto.");
            } catch (FileException e) {
                System.out.println("Errore durante il salvataggio del file: " + e);
            }
        }

        scanner.close();
    }

    public static Cavallo[] aggiungiCavallo(Cavallo[] listaCavalli, Scanner scanner) {
        // Implementazione aggiungiCavallo
        return listaCavalli;
    }

    public static Fantino[] aggiungiFantino(Fantino[] listaFantini, Scanner scanner) {
        // Implementazione aggiungiFantino
        return listaFantini;
    }

    public static Scuderia[] aggiungiScuderia(Scuderia[] listaScuderie, Fantino[] listaFantini, Scanner scanner) {
        // Implementazione aggiungiScuderia
        return listaScuderie;
    }

    public static void visualizzaListaCavalli(Cavallo[] listaCavalli) {
        // Implementazione visualizzaListaCavalli
    }

    public static void visualizzaListaFantini(Fantino[] listaFantini) {
        // Implementazione visualizzaListaFantini
    }

    public static void visualizzaListaScuderie(Scuderia[] listaScuderie) {
        // Implementazione visualizzaListaScuderie
    }

    public static void salvaCSV(Cavallo[] listaCavalli, Fantino[] listaFantini, Scuderia[] listaScuderie, String csvFile) throws FileException {
        // Implementazione salvaCSV
    }

    public static void salvaBinario(Cavallo[] listaCavalli, Fantino[] listaFantini, Scuderia[] listaScuderie, String binFile) throws FileException {
        // Implementazione salvaBinario
    }

    public static void ordinaCavalliPerNome(Cavallo[] listaCavalli) {
        // Implementazione ordinaCavalliPerNome
    }

    public static void ordinaFantiniPerNome(Fantino[] listaFantini) {
        // Implementazione ordinaFantiniPerNome
    }

    public static void ordinaScuderiePerNomeFantino(Scuderia[] listaScuderie) {
        // Implementazione ordinaScuderiePerNomeFantino
    }
}
