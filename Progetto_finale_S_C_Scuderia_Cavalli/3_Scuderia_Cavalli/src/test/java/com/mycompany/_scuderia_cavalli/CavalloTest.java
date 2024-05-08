package com.mycompany._scuderia_cavalli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario per la classe Cavallo.
 */
public class CavalloTest {
    
    public CavalloTest() {
    }

    /**
     * Verifica che il metodo getNomeCavallo restituisca correttamente il nome del cavallo.
     */
    @Test
    public void testGetNomeCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        assertEquals("CavalloTest", cavallo.getNomeCavallo());
    }

    /**
     * Verifica che il metodo getEtaCavallo restituisca correttamente l'età del cavallo.
     */
    @Test
    public void testGetEtaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        assertEquals(5, cavallo.getEtaCavallo());
    }

    /**
     * Verifica che il metodo getRazzaCavallo restituisca correttamente la razza del cavallo.
     */
    @Test
    public void testGetRazzaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        assertEquals("RazzaTest", cavallo.getRazzaCavallo());
    }

    /**
     * Verifica che il metodo getAltezzaCavallo restituisca correttamente l'altezza del cavallo.
     */
    @Test
    public void testGetAltezzaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        assertEquals(1.2, cavallo.getAltezzaCavallo());
    }

    /**
     * Verifica che il metodo setNomeCavallo imposti correttamente il nome del cavallo.
     */
    @Test
    public void testSetNomeCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        cavallo.setNomeCavallo("NuovoNome");
        assertEquals("NuovoNome", cavallo.getNomeCavallo());
    }

    /**
     * Verifica che il metodo setEtaCavallo imposti correttamente l'età del cavallo.
     */
    @Test
    public void testSetEtaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        cavallo.setEtaCavallo(10);
        assertEquals(10, cavallo.getEtaCavallo());
    }

    /**
     * Verifica che il metodo setRazzaCavallo imposti correttamente la razza del cavallo.
     */
    @Test
    public void testSetRazzaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        cavallo.setRazzaCavallo("NuovaRazza");
        assertEquals("NuovaRazza", cavallo.getRazzaCavallo());
    }

    /**
     * Verifica che il metodo setAltezzaCavallo imposti correttamente l'altezza del cavallo.
     */
    @Test
    public void testSetAltezzaCavallo() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        cavallo.setAltezzaCavallo(1.5);
        assertEquals(1.5, cavallo.getAltezzaCavallo());
    }

    /**
     * Verifica che il metodo toString restituisca una stringa che rappresenta correttamente il cavallo.
     */
    @Test
    public void testToString() {
        Cavallo cavallo = new Cavallo("CavalloTest", 5, "RazzaTest", 1.2);
        String expected = "Cavallo{nomeCavallo=CavalloTest, etaCavallo=5, razzaCavallo=RazzaTest, altezzaCavallo=1.2}";
        assertEquals(expected, cavallo.toString());
    }
    
}
