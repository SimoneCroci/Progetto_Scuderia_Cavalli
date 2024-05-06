package com.mycompany._scuderia_cavalli;

import static com.mycompany._scuderia_cavalli.Fantino.N_MAX_FANTINI;
import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneOccupata;
import eccezioni.EccezionePosizioneVuota;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Scuderia {
    private Cavallo[] cavalli;
    private Fantino[] fantini;
    private Scuderia[] scuderie;
    private int nCavalli;
    private int nFantini;
    private int nScuderie;
    private String numeroFantino;
    private String nomeFantino;
    private String nomeCavallo;
    
    private String sede;
    private int annoFondazione;
    static final int N_MAX_SCUDERIE = 6;
    static final int N_MAX_FANTINI= 30;
    static final int N_MAX_CAVALLI= 30;

    // Costruttore
    public Scuderia(String numeroFantino, String nomeFantino, String nomeCavallo, String sede, int annoFondazione) {
        this.numeroFantino = numeroFantino;
        this.nomeFantino = nomeFantino;
        this.nomeCavallo = nomeCavallo;
        this.sede = sede;
        this.annoFondazione = annoFondazione;
        nCavalli=0;
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
    
    // rimuovi
    
     public void rimuoviFantino(int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneVuota
    {
        
        if(posizione<0 || posizione>N_MAX_FANTINI)
            throw new EccezionePosizioneNonValida();
 
        if (fantini[posizione]==null)
                throw new EccezionePosizioneVuota();
        fantini[posizione]=null;
        //    return posizione;  
    }

      public void rimuoviCavallo(int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneVuota
    {
        
        if(posizione<0 || posizione>N_MAX_CAVALLI)
            throw new EccezionePosizioneNonValida();
 
        if (scuderie[posizione]==null)
                throw new EccezionePosizioneVuota();
        scuderie[posizione]=null;
        //    return posizione;  
    }
    
      //aggiungi
      
      public void aggiungiCavallo(Cavallo cavallo, int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata
    {
        if (posizione<0 || posizione>=N_MAX_CAVALLI)
           throw new EccezionePosizioneNonValida();
        if(cavalli[posizione]!=null)
              throw new EccezionePosizioneOccupata();
        cavalli[posizione]=new Cavallo(cavallo);
        //return posizione;  
    }
    
     public void aggiungiFantino(Fantino fantino, int posizione) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata
    {
        if (posizione<0 || posizione>=N_MAX_FANTINI)
           throw new EccezionePosizioneNonValida();
        if(fantini[posizione]!=null)
              throw new EccezionePosizioneOccupata();
        fantini[posizione]=new Fantino(fantino);
        //return posizione;  
    }
     
     
     
    }
    @Override
    public String toString() {
        return "Scuderia{" + "numeroFantino=" + numeroFantino + ", nomeFantino=" + nomeFantino + ", nomeCavallo=" + nomeCavallo + ", sede=" + sede + ", annoFondazione=" + annoFondazione + '}';
    }


}

