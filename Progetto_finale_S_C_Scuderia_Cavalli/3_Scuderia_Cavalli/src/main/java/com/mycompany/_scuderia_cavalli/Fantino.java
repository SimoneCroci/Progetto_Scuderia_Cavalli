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
    
    
    @Override
    public String toString() {
        return "Fantino{" + "nomeFantino=" + nomeFantino + ", eta=" + eta + ", nazionalita=" + nazionalita + ", altezza=" + altezza + '}';
    }
}
