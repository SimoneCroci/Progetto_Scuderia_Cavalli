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
    
    @Override
    public String toString() {
        return "Cavallo{" + "nomeCavallo=" + nomeCavallo + ", etaCavallo=" + etaCavallo + ", razzaCavallo=" + razzaCavallo + ", altezzaCavallo=" + altezzaCavallo + '}';
    }
}
