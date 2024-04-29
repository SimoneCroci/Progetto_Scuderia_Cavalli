package com.mycompany._scuderia_cavalli;

import java.io.*;
import java.util.*;

public class Fantino {
    private String nomeFantino;
    private int eta;
    private String nazionalita;
    private String altezza;
    static final int N_MAX_FANTINI = 30;

    // Costruttore
    public Fantino(String nomeFantino, int eta, String nazionalita, String altezza) {
        this.nomeFantino = nomeFantino;
        this.eta = eta;
        this.nazionalita = nazionalita;
        this.altezza = altezza;
    }

    // Costruttore di copia
    public Fantino(Fantino f1) {
        this.nomeFantino = f1.nomeFantino;
        this.eta = f1.eta;
        this.nazionalita = f1.nazionalita;
        this.altezza = f1.altezza;
    }

    // Metodi getter
    public String getNomeFantino() {
        return nomeFantino;
    }

    public int getEta() {
        return eta;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public String getAltezza() {
        return altezza;
    }

    // Metodi setter
    public void setNomeFantino(String nomeFantino) {
        this.nomeFantino = nomeFantino;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public void setAltezza(String altezza) {
        this.altezza = altezza;
    }

    // Metodo per aggiungere un fantino
    public void aggiungiFantino(String nomeFantino, int eta, String nazionalita, String altezza) {
        this.nomeFantino = nomeFantino;
        this.eta = eta;
        this.nazionalita = nazionalita;
        this.altezza = altezza;
    }

    // Metodo per rimuovere un fantino
    public void rimuoviFantino(String nomeFantino) {
        if (this.nomeFantino.equals(nomeFantino)) {
            this.nomeFantino = null;
            this.eta = 0;
            this.nazionalita = null;
            this.altezza = null;
        }
    }

    // Metodo per modificare un fantino
    public void modificaFantino(String nomeFantino, String nuovoNomeFantino, int nuovaEta, String nuovaNazionalita, String nuovaAltezza) {
        if (this.nomeFantino.equals(nomeFantino)) {
            this.nomeFantino = nuovoNomeFantino;
            this.eta = nuovaEta;
            this.nazionalita = nuovaNazionalita;
            this.altezza = nuovaAltezza;
        }
    }

    // Metodo per salvare in formato CSV
    public void salvaCSV(String nomeFile) {
        try (PrintWriter writer = new PrintWriter(nomeFile)) {
            writer.println(nomeFantino + "," + eta + "," + nazionalita + "," + altezza);
        } catch (FileNotFoundException e) {
            System.out.println("Errore: Impossibile scrivere su file CSV.");
        }
    }

    // Metodo per salvare in formato binario
    public void salvaBinario(String nomeFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(this);
            System.out.println("Salvataggio binario completato.");
        } catch (IOException e) {
            System.out.println("Errore: Impossibile scrivere su file binario.");
        }
    }

    // Metodo per ordinare i fantini per nome
    public void ordinaFantiniPerNome() {
        boolean ordinato = false;
        while (!ordinato) {
            ordinato = true;
            for (int i = 0; i < N_MAX_FANTINI - 1; i++) {
                Fantino[] listaFantini = null;
                if (listaFantini[i] == null || listaFantini[i + 1] == null) {
                    continue;
                }
                if (listaFantini[i].getNomeFantino().compareTo(listaFantini[i + 1].getNomeFantino()) > 0) {
                    Fantino temp = listaFantini[i];
                    listaFantini[i] = listaFantini[i + 1];
                    listaFantini[i + 1] = temp;
                    ordinato = false;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Fantino{" + "nomeFantino=" + nomeFantino + ", eta=" + eta + ", nazionalita=" + nazionalita + ", altezza=" + altezza + '}';
    }
}
