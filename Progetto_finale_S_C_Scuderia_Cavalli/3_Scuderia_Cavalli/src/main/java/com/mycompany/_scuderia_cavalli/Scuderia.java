package com.mycompany._scuderia_cavalli;

import java.io.*;
import java.util.*;
import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneOccupata;
import eccezioni.EccezionePosizioneVuota;
import eccezioni.EccezioneRipianoNonValido;
import eccezioni.FileException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.metal.MetalBorders;
import utilita.ConsoleInput;
import utilita.Menu;

public class Scuderia {
    private String numeroFantino;
    private String nomeFantino;
    private String nomeCavallo;
    private String sede;
    private int annoFondazione;
    static final int N_MAX_SCUDERIE = 6;

    // Costruttore
    public Scuderia(String numeroFantino, String nomeFantino, String nomeCavallo, String sede, int annoFondazione) {
        this.numeroFantino = numeroFantino;
        this.nomeFantino = nomeFantino;
        this.nomeCavallo = nomeCavallo;
        this.sede = sede;
        this.annoFondazione = annoFondazione;
    }

    // Costruttore di copia
    public Scuderia(Scuderia s1) {
        this.numeroFantino = s1.numeroFantino;
        this.nomeFantino = s1.nomeFantino;
        this.nomeCavallo = s1.nomeCavallo;
        this.sede = s1.sede;
        this.annoFondazione = s1.annoFondazione;
    }

    // Metodi getter
    public String getNumeroFantino() {
        return numeroFantino;
    }

    public String getNomeFantino() {
        return nomeFantino;
    }

    public String getNomeCavallo() {
        return nomeCavallo;
    }

    public String getSede() {
        return sede;
    }

    public int getAnnoFondazione() {
        return annoFondazione;
    }

    // Metodi setter
    public void setNumeroFantino(String numeroFantino) {
        this.numeroFantino = numeroFantino;
    }

    public void setNomeFantino(String nomeFantino) {
        this.nomeFantino = nomeFantino;
    }

    public void setNomeCavallo(String nomeCavallo) {
        this.nomeCavallo = nomeCavallo;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setAnnoFondazione(int annoFondazione) {
        this.annoFondazione = annoFondazione;
    }

    // Metodo per aggiungere una scuderia
    public void aggiungiScuderia(String numeroFantino, String nomeFantino, String nomeCavallo, String sede, int annoFondazione) 
    {
        this.numeroFantino = numeroFantino;
        this.nomeFantino = nomeFantino;
        this.nomeCavallo = nomeCavallo;
        this.sede = sede;
        this.annoFondazione = annoFondazione;
    }

    // Metodo per rimuovere una scuderia
    public void rimuoviScuderia(String numeroFantino) {
        if (this.numeroFantino.equals(numeroFantino)) {
            this.numeroFantino = null;
            this.nomeFantino = null;
            this.nomeCavallo = null;
            this.sede = null;
            this.annoFondazione = 0;
        }
    }

    // Metodo per modificare una scuderia
    public void modificaScuderia(String numeroFantino, String nuovoNomeFantino, String nuovoNomeCavallo, String nuovaSede, int nuovoAnnoFondazione) {
        if (this.numeroFantino.equals(numeroFantino)) {
            this.nomeFantino = nuovoNomeFantino;
            this.nomeCavallo = nuovoNomeCavallo;
            this.sede = nuovaSede;
            this.annoFondazione = nuovoAnnoFondazione;
        }
    }

    // Metodo per salvare in formato CSV
    public void salvaCSV(String nomeFile) {
        try (PrintWriter writer = new PrintWriter(nomeFile)) {
            writer.println(numeroFantino + "," + nomeFantino + "," + nomeCavallo + "," + sede + "," + annoFondazione);
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

    // Metodo per ordinare le scuderie per nome fantino
    public void ordinaScuderiePerNomeFantino(Scuderia[] listaScuderie) {
        boolean ordinato = false;
        while (!ordinato) {
            ordinato = true;
            for (int i = 0; i < N_MAX_SCUDERIE - 1; i++) {
                if (listaScuderie[i] == null || listaScuderie[i + 1] == null) {
                    continue;
                }
                if (listaScuderie[i].getNomeFantino().compareTo(listaScuderie[i + 1].getNomeFantino()) > 0) {
                    Scuderia temp = listaScuderie[i];
                    listaScuderie[i] = listaScuderie[i + 1];
                    listaScuderie[i + 1] = temp;
                    ordinato = false;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Scuderia{" + "numeroFantino=" + numeroFantino + ", nomeFantino=" + nomeFantino + ", nomeCavallo=" + nomeCavallo + ", sede=" + sede + ", annoFondazione=" + annoFondazione + '}';
    }


}

