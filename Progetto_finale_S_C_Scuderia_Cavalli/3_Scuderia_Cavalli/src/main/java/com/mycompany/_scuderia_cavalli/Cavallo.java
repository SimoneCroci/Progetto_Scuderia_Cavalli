package com.mycompany._scuderia_cavalli;

import java.io.Serializable;

/**
 * Rappresenta un cavallo all'interno di una scuderia.
 */
public class Cavallo implements Serializable {
    private String nomeCavallo;
    private int etaCavallo;
    private String razzaCavallo;
    private double altezzaCavallo;
    static final int N_MAX_CAVALLI = 30;

    /**
     * Costruttore della classe Cavallo.
     *
     * @param nomeCavallo    il nome del cavallo
     * @param etaCavallo     l'età del cavallo
     * @param razzaCavallo   la razza del cavallo
     * @param altezzaCavallo l'altezza del cavallo
     */
    public Cavallo(String nomeCavallo, int etaCavallo, String razzaCavallo, double altezzaCavallo) {
        this.nomeCavallo = nomeCavallo;
        this.etaCavallo = etaCavallo;
        this.razzaCavallo = razzaCavallo;
        this.altezzaCavallo = altezzaCavallo;
    }

    /**
     * Costruttore di copia della classe Cavallo.
     *
     * @param c1 il cavallo da copiare
     */
    public Cavallo(Cavallo c1) {
        this.nomeCavallo = c1.nomeCavallo;
        this.etaCavallo = c1.etaCavallo;
        this.razzaCavallo = c1.razzaCavallo;
        this.altezzaCavallo = c1.altezzaCavallo;
    }

    /**
     * Restituisce il nome del cavallo.
     *
     * @return il nome del cavallo
     */
    public String getNomeCavallo() {
        return nomeCavallo;
    }

    /**
     * Restituisce l'età del cavallo.
     *
     * @return l'età del cavallo
     */
    public int getEtaCavallo() {
        return etaCavallo;
    }

    /**
     * Restituisce la razza del cavallo.
     *
     * @return la razza del cavallo
     */
    public String getRazzaCavallo() {
        return razzaCavallo;
    }

    /**
     * Restituisce l'altezza del cavallo.
     *
     * @return l'altezza del cavallo
     */
    public double getAltezzaCavallo() {
        return altezzaCavallo;
    }

    /**
     * Imposta il nome del cavallo.
     *
     * @param nomeCavallo il nuovo nome del cavallo
     */
    public void setNomeCavallo(String nomeCavallo) {
        this.nomeCavallo = nomeCavallo;
    }

    /**
     * Imposta l'età del cavallo.
     *
     * @param etaCavallo la nuova età del cavallo
     */
    public void setEtaCavallo(int etaCavallo) {
        this.etaCavallo = etaCavallo;
    }

    /**
     * Imposta la razza del cavallo.
     *
     * @param razzaCavallo la nuova razza del cavallo
     */
    public void setRazzaCavallo(String razzaCavallo) {
        this.razzaCavallo = razzaCavallo;
    }

    /**
     * Imposta l'altezza del cavallo.
     *
     * @param altezzaCavallo la nuova altezza del cavallo
     */
    public void setAltezzaCavallo(double altezzaCavallo) {
        this.altezzaCavallo = altezzaCavallo;
    }

    /**
     * Restituisce una stringa che rappresenta il cavallo.
     *
     * @return una stringa che rappresenta il cavallo
     */
    @Override
    public String toString() {
        return "Cavallo{" + "nomeCavallo=" + nomeCavallo + ", etaCavallo=" + etaCavallo + ", razzaCavallo=" + razzaCavallo + ", altezzaCavallo=" + altezzaCavallo + '}';
    }
}
