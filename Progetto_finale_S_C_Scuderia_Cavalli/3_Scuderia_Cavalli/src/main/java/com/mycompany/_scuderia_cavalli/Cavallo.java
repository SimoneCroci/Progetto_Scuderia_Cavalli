package com.mycompany._scuderia_cavalli;

import java.io.*;
import java.util.*;

public class Cavallo {
    private String nomeCavallo;
    private int etaCavallo;
    private String razzaCavallo;
    private String altezzaCavallo;
    static final int N_MAX_CAVALLI = 30;

    // Costruttore
    public Cavallo(String nomeCavallo, int etaCavallo, String razzaCavallo, String altezzaCavallo) {
        this.nomeCavallo = nomeCavallo;
        this.etaCavallo = etaCavallo;
        this.razzaCavallo = razzaCavallo;
        this.altezzaCavallo = altezzaCavallo;
    }

    // Costruttore di copia
    public Cavallo(Cavallo c1) {
        this.nomeCavallo = c1.nomeCavallo;
        this.etaCavallo = c1.etaCavallo;
        this.razzaCavallo = c1.razzaCavallo;
        this.altezzaCavallo = c1.altezzaCavallo;
    }

    // Metodi getter
    public String getNomeCavallo() {
        return nomeCavallo;
    }

    public int getEtaCavallo() {
        return etaCavallo;
    }

    public String getRazzaCavallo() {
        return razzaCavallo;
    }

    public String getAltezzaCavallo() {
        return altezzaCavallo;
    }

    // Metodi setter
    public void setNomeCavallo(String nomeCavallo) {
        this.nomeCavallo = nomeCavallo;
    }

    public void setEtaCavallo(int etaCavallo) {
        this.etaCavallo = etaCavallo;
    }

    public void setRazzaCavallo(String razzaCavallo) {
        this.razzaCavallo = razzaCavallo;
    }

    public void setAltezzaCavallo(String altezzaCavallo) {
        this.altezzaCavallo = altezzaCavallo;
    }

    // Metodo per aggiungere un cavallo
    public void aggiungiCavallo(String nomeCavallo, int etaCavallo, String razzaCavallo, String altezzaCavallo) 
    {
        this.nomeCavallo = nomeCavallo;
        this.etaCavallo = etaCavallo;
        this.razzaCavallo = razzaCavallo;
        this.altezzaCavallo = altezzaCavallo;
    }

    // Metodo per rimuovere un cavallo
    public void rimuoviCavallo(String nomeCavallo) 
    {
        if (this.nomeCavallo.equals(nomeCavallo)) 
        {
            this.nomeCavallo = null;
            this.etaCavallo = 0;
            this.razzaCavallo = null;
            this.altezzaCavallo = null;
        }
    }

    // Metodo per modificare un cavallo
    public void modificaCavallo(String nomeCavallo, String nuovoNomeCavallo, int nuovaEtaCavallo, String nuovaRazzaCavallo, String nuovaAltezzaCavallo) {
        
        if (this.nomeCavallo.equals(nomeCavallo)) 
        {
            this.nomeCavallo = nuovoNomeCavallo;
            this.etaCavallo = nuovaEtaCavallo;
            this.razzaCavallo = nuovaRazzaCavallo;
            this.altezzaCavallo = nuovaAltezzaCavallo;
        }
    }

    // Metodo per salvare in formato CSV
    public void salvaCSV(String nomeFile)
    {
        // Implementazione per il salvataggio in formato CSV
        try (PrintWriter writer = new PrintWriter(nomeFile)) 
        {
            writer.println(nomeCavallo + "," + etaCavallo + "," + razzaCavallo + "," + altezzaCavallo);
        } catch (FileNotFoundException e) 
        {
            System.out.println("Errore: Impossibile scrivere su file CSV.");
        }
    }

    // Metodo per salvare in formato binario
    public void salvaBinario(String nomeFile) 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) 
        {
            oos.writeObject(this);
            System.out.println("Salvataggio binario completato.");
        } catch (IOException e) 
        {
            System.out.println("Errore: Impossibile scrivere su file binario.");
        }
    }

    // Metodo per ordinare i cavalli per nome
    public void ordinaCavalliPerNome() {
        boolean ordinato = false;
        while (!ordinato) {
            ordinato = true;
            int numeroCavalli = 0;
            for (int i = 0; i < numeroCavalli - 1; i++) {
                Cavallo[] listaCavalli = null;
                if (listaCavalli[i].getNomeCavallo().compareTo(listaCavalli[i + 1].getNomeCavallo()) > 0) {
                    // Scambia i due cavalli
                    Cavallo temp = listaCavalli[i];
                    listaCavalli[i] = listaCavalli[i + 1];
                    listaCavalli[i + 1] = temp;
                    ordinato = false;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Cavallo{" + "nomeCavallo=" + nomeCavallo + ", etaCavallo=" + etaCavallo + ", razzaCavallo=" + razzaCavallo + ", altezzaCavallo=" + altezzaCavallo + '}';
    }
}
