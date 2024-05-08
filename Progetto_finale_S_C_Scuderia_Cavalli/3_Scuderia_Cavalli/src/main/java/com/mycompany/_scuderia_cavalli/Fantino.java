package com.mycompany._scuderia_cavalli;

import java.io.Serializable;

/**
 * Rappresenta un fantino all'interno di una scuderia.
 */
public class Fantino implements Serializable {
    private String nomeFantino;
    private int eta;
    private String nazionalita;
    private double altezza;
    static final int N_MAX_FANTINI = 30;

    /**
     * Costruttore della classe Fantino.
     *
     * @param nomeFantino   il nome del fantino
     * @param eta           l'età del fantino
     * @param nazionalita   la nazionalità del fantino
     * @param altezza       l'altezza del fantino
     */
    public Fantino(String nomeFantino, int eta, String nazionalita, double altezza) {
        this.nomeFantino = nomeFantino;
        this.eta = eta;
        this.nazionalita = nazionalita;
        this.altezza = altezza;
    }

    /**
     * Costruttore di copia della classe Fantino.
     *
     * @param f1 il fantino da copiare
     */
    public Fantino(Fantino f1) {
        this.nomeFantino = f1.nomeFantino;
        this.eta = f1.eta;
        this.nazionalita = f1.nazionalita;
        this.altezza = f1.altezza;
    }

    /**
     * Restituisce il nome del fantino.
     *
     * @return il nome del fantino
     */
    public String getNomeFantino() {
        return nomeFantino;
    }

    /**
     * Restituisce l'età del fantino.
     *
     * @return l'età del fantino
     */
    public int getEta() {
        return eta;
    }

    /**
     * Restituisce la nazionalità del fantino.
     *
     * @return la nazionalità del fantino
     */
    public String getNazionalita() {
        return nazionalita;
    }

    /**
     * Restituisce l'altezza del fantino.
     *
     * @return l'altezza del fantino
     */
    public double getAltezza() {
        return altezza;
    }

    /**
     * Imposta il nome del fantino.
     *
     * @param nomeFantino il nuovo nome del fantino
     */
    public void setNomeFantino(String nomeFantino) {
        this.nomeFantino = nomeFantino;
    }

    /**
     * Imposta l'età del fantino.
     *
     * @param eta la nuova età del fantino
     */
    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * Imposta la nazionalità del fantino.
     *
     * @param nazionalita la nuova nazionalità del fantino
     */
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    /**
     * Imposta l'altezza del fantino.
     *
     * @param altezza la nuova altezza del fantino
     */
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    /**
     * Restituisce una stringa che rappresenta il fantino.
     *
     * @return una stringa che rappresenta il fantino
     */
    @Override
    public String toString() {
        return "Fantino{" + "nomeFantino=" + nomeFantino + ", eta=" + eta + ", nazionalita=" + nazionalita + ", altezza=" + altezza + '}';
    }
}
