package utilita;

import java.io.*;

/**
 * Classe che rappresenta una Console di Input (tastiera)
 * Un oggetto istanza della classe Console Input espone dei metodi
 * che consentono di acquisire dalla tastiera 
 * variabili di ciascun tipo di dato nativo (int, short, double ecc...) 
 * e oggetti di tipo String.
 */
public class ConsoleInput {
    private InputStreamReader input;
    private BufferedReader tastiera;
    
    /**
     * Costruttore
     */
    public ConsoleInput() {
        input = new InputStreamReader(System.in);
        tastiera = new BufferedReader(input);
    }
    
    /**
     * Metodo per la lettura di una stringa
     * @return la stringa letta
     * @throws IOException Errore di lettura
     */
    public String readString() throws IOException {
        return tastiera.readLine();
    }
    
    /**
     * Metodo per la lettura di un intero
     * @return l'intero letto
     * @throws IOException Errore di lettura
     * @throws NumberFormatException Errore del formato
     */
    public int readInt() throws IOException, NumberFormatException {
        try {
            clearBuffer(); // Pulisce il buffer di input prima di leggere un nuovo input
            return Integer.parseInt(tastiera.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace(); // o gestisci l'eccezione in modo appropriato
            throw e; // Rilancia l'eccezione per essere gestita dall'utente del metodo
        }
    }
    
    /**
     * Metodo per la lettura di un double
     * @return il double letto
     * @throws IOException Errore di lettura
     * @throws NumberFormatException Errore del formato
     */
    public double readDouble() throws IOException, NumberFormatException {
        try {
            clearBuffer(); // Pulisce il buffer di input prima di leggere un nuovo input
            return Double.parseDouble(tastiera.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace(); // o gestisci l'eccezione in modo appropriato
            throw e; // Rilancia l'eccezione per essere gestita dall'utente del metodo
        }
    }
    
    /**
     * Metodo per la pulizia del buffer di input
     */
    public void clearBuffer() {
        try {
            while (tastiera.ready()) {
                tastiera.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
