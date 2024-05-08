/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;

import com.mycompany._scuderia_cavalli.Cavallo;
import java.io.Serializable;

public class Ordinatore implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Scambia fra di loro gli elementi in posizione pos1 e in posizione pos2 di un
     * array di cavalli v
     * 
     * @param v    l'array di cavalli
     * @param pos1 la posizione del primo elemento
     * @param pos2 la posizione del secondo elemento
     */
    public static void scambia(Cavallo[] v, int pos1, int pos2) {
        Cavallo sost = v[pos1];
        v[pos1] = v[pos2];
        v[pos2] = sost;
    }

    /**
     * Restituisce una copia ordinata in ordine alfabetico crescente di un vettore
     * di cavalli v utilizzando l'algoritmo selection sort
     * 
     * @param v il vettore da ordinare
     * @return il vettore in ordine crescente
     */
    public static Cavallo[] selectionSortCrescente(Cavallo[] v) {
        int lunghezza = v.length;
        Cavallo[] vOrdinato = new Cavallo[lunghezza];
        for (int i = 0; i < lunghezza; i++)
            vOrdinato[i] = v[i];

        for (int i = 0; i < lunghezza - 1; i++) {
            for (int j = i + 1; j < lunghezza; j++) {
                if (vOrdinato[j].getNomeCavallo().compareToIgnoreCase(vOrdinato[i].getNomeCavallo()) < 0)
                    scambia(vOrdinato, i, j);
            }
        }
        return vOrdinato;
    }

    /**
     * Restituisce una copia ordinata in ordine alfabetico decrescente di un
     * vettore di cavalli v utilizzando l'algoritmo selection sort
     * 
     * @param v il vettore da ordinare
     * @return il vettore in ordine decrescente
     */
    public static Cavallo[] selectionSortDecrescente(Cavallo[] v) {
        int lunghezza = v.length;
        Cavallo[] vOrdinato = new Cavallo[lunghezza];
        for (int i = 0; i < lunghezza; i++)
            vOrdinato[i] = v[i];

        for (int i = 0; i < lunghezza - 1; i++) {
            for (int j = i + 1; j < lunghezza; j++) {
                if (vOrdinato[j].getNomeCavallo().compareToIgnoreCase(vOrdinato[i].getNomeCavallo()) > 0)
                    scambia(vOrdinato, i, j);
            }
        }
        return vOrdinato;
    }
}

