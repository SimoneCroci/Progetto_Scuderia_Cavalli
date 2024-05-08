/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._scuderia_cavalli;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneOccupata;
import eccezioni.EccezionePosizioneVuota;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test della classe Scuderia.
 */
public class ScuderiaTest {

    private Scuderia scuderia;

    @BeforeEach
    public void setUp() {
        scuderia = new Scuderia(2000, "Scuderia Test", "Sede di prova");
    }

    /**
     * Test of getNome method, of class Scuderia.
     */
    @Test
    public void testGetNome() {
        assertEquals("Scuderia Test", scuderia.getNome());
    }

    /**
     * Test of setNome method, of class Scuderia.
     */
    @Test
    public void testSetNome() {
        scuderia.setNome("Nuovo Nome");
        assertEquals("Nuovo Nome", scuderia.getNome());
    }

    /**
     * Test of getSede method, of class Scuderia.
     */
    @Test
    public void testGetSede() {
        assertEquals("Sede di prova", scuderia.getSede());
    }

    /**
     * Test of setSede method, of class Scuderia.
     */
    @Test
    public void testSetSede() {
        scuderia.setSede("Nuova Sede");
        assertEquals("Nuova Sede", scuderia.getSede());
    }

    /**
     * Test of getAnnoFondazione method, of class Scuderia.
     */
    @Test
    public void testGetAnnoFondazione() {
        assertEquals(2000, scuderia.getAnnoFondazione());
    }

    /**
     * Test of setAnnoFondazione method, of class Scuderia.
     */
    @Test
    public void testSetAnnoFondazione() {
        scuderia.setAnnoFondazione(2020);
        assertEquals(2020, scuderia.getAnnoFondazione());
    }

    /**
     * Test of getNCavalli method, of class Scuderia.
     */
    @Test
    public void testGetNCavalli() {
        assertEquals(0, scuderia.getNCavalli());
    }

    /**
     * Test of setNCavalli method, of class Scuderia.
     */
    @Test
    public void testSetNCavalli() {
        scuderia.setNCavalli(5);
        assertEquals(5, scuderia.getNCavalli());
    }

    /**
     * Test of getNFantini method, of class Scuderia.
     */
    @Test
    public void testGetNFantini() {
        assertEquals(0, scuderia.getNFantini());
    }

    /**
     * Test of setNFantini method, of class Scuderia.
     */
    @Test
    public void testSetNFantini() {
        scuderia.setNFantini(3);
        assertEquals(3, scuderia.getNFantini());
    }

    /**
     * Test of rimuoviCavallo method, of class Scuderia.
     */
    @Test
    public void testRimuoviCavallo_PosizioneValida_CavalloRimosso() throws Exception {
        Cavallo cavallo = new Cavallo("Cavallo Test", 5, "Razza Test", 1.5);
        scuderia.aggiungiCavallo(cavallo, 0);
        scuderia.rimuoviCavallo(0);
        assertNull(scuderia.getCavalli()[0]);
    }

    /**
     * Test of rimuoviCavallo method, of class Scuderia.
     */
    @Test
    public void testRimuoviCavallo_PosizioneNonValida_EccezionePosizioneNonValidaLanciata() {
        assertThrows(EccezionePosizioneNonValida.class, () -> {
            scuderia.rimuoviCavallo(-1);
        });
    }

    /**
     * Test of rimuoviCavallo method, of class Scuderia.
     */
    @Test
    public void testRimuoviCavallo_PosizioneVuota_EccezionePosizioneVuotaLanciata() {
        assertThrows(EccezionePosizioneVuota.class, () -> {
            scuderia.rimuoviCavallo(0);
        });
    }

    /**
     * Test of aggiungiCavallo method, of class Scuderia.
     */
    @Test
    public void testAggiungiCavallo_PosizioneValida_CavalloAggiunto() throws Exception {
        Cavallo cavallo = new Cavallo("Cavallo Test", 5, "Razza Test", 1.5);
        scuderia.aggiungiCavallo(cavallo, 0);
        assertEquals(cavallo, scuderia.getCavalli()[0]);
    }

    /**
     * Test of aggiungiCavallo method, of class Scuderia.
     */
    @Test
    public void testAggiungiCavallo_PosizioneNonValida_EccezionePosizioneNonValidaLanciata() {
        Cavallo cavallo = new Cavallo("Cavallo Test", 5, "Razza Test", 1.5);
        assertThrows(EccezionePosizioneNonValida.class, () -> {
            scuderia.aggiungiCavallo(cavallo, -1);
        });
    }

    /**
     * Test of aggiungiCavallo method, of class Scuderia.
     */
    @Test
    public void testAggiungiCavallo_PosizioneOccupata_EccezionePosizioneOccupataLanciata() throws Exception {
        Cavallo cavallo1 = new Cavallo("Cavallo Test 1", 5, "Razza Test", 1.5);
        Cavallo cavallo2 = new Cavallo("Cavallo Test 2", 6, "Razza Test", 1.6);
        scuderia.aggiungiCavallo(cavallo1, 0);
        assertThrows(EccezionePosizioneOccupata.class, () -> {
            scuderia.aggiungiCavallo(cavallo2, 0);
        });
    }

    /**
     * Test of mostraNomiCavalli method, of class Scuderia.
     */
    @Test
    public void testMostraNomiCavalli() throws EccezionePosizioneNonValida, EccezionePosizioneOccupata {
        Cavallo cavallo1 = new Cavallo("Cavallo Test 1", 5, "Razza Test", 1.5);
        Cavallo cavallo2 = new Cavallo("Cavallo Test 2", 6, "Razza Test", 1.6);
        scuderia.aggiungiCavallo(cavallo1, 0);
        scuderia.aggiungiCavallo(cavallo2, 1);
        scuderia.mostraNomiCavalli();
        // Verifica visiva, non lancio eccezioni
    }

    /**
     * Test of mostraElencoFantiniOrdinati method, of class Scuderia.
     */
    @Test
    public void testMostraElencoFantiniOrdinati() {
        Fantino fantino1 = new Fantino("Fantino Test 1", 30, "Nazionalita Test", 1.7);
        Fantino fantino2 = new Fantino("Fantino Test 2", 25, "Nazionalita Test", 1.6);
        scuderia.mostraElencoFantiniOrdinati();
        // Verifica visiva, non lancio eccezioni
    }

    /**
     * Test of getCavalli method, of class Scuderia.
     */
    @Test
    public void testGetCavalli() {
        Cavallo[] expResult = new Cavallo[Scuderia.N_MAX_CAVALLI];
        assertArrayEquals(expResult, scuderia.getCavalli());
    }

    /**
     * Test of elencoNomiCavalliOrdinatiAlfabeticamente method, of class Scuderia.
     */
    @Test
    public void testElencoNomiCavalliOrdinatiAlfabeticamente() {
        String[] result = scuderia.elencoNomiCavalliOrdinatiAlfabeticamente();
        assertNull(result[0]); // Verifica che l'array sia vuoto
    }

    /**
     * Test of getCavallo method, of class Scuderia.
     */
    @Test
    public void testGetCavallo() {
        assertThrows(UnsupportedOperationException.class, () -> {
            scuderia.getCavallo(0);
        });
    }
}
