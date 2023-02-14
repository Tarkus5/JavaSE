/*
Inserire una frase ed effettuare lo scambio tra le lettere di posizione pari
con quelle dispari e poi ristampiamo la nuova frase

-Implementazione:
 sostituire le vocali con il numero 8 (o altre)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inserire la stringa
        Scanner scanner = new Scanner(System.in); //Creo la scanner per inserire la frase da tastiera
        System.out.println("Inserisci la tua frase"); //Chiedo all'utente d'inserire la frase
        String frase = scanner.nextLine(); //Leggo la frase inserita e la inserisco in una variabile
        System.out.println("La frase inserita è: " + frase); //Stampa di controllo per verificare inserimento da scanner
        //Leggo la stringa lettera per lettera e verifico la posizione
        for (int i = 0; i < frase.length(); i++){
            char carattere = frase.charAt(i);
            //System.out.println("Lettera all'indice " + i + ": " + carattere);
            }
        //Inizializzo lo stringBuilder, che mi servirà per fare lo switch delle posizioni
        StringBuilder sb = new StringBuilder(frase);
        //Creo un ciclo per leggere la stringa
        for (int j = 0; j < sb.length()-1; j++){
            if (j % 2 == 0){
                //Eseguo lo switch delle posizioni pari con le dispari
                char carattere = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(j+1));
                sb.setCharAt(j+1, carattere);
            }
        }
        System.out.println("Invertendo gli indici della stringa, otteniamo la frase: " + sb.toString());
        //Utilizzo il replaceAll per rimpiazzare le vocali con il numero "8".
        frase = frase.replaceAll("(?i)[aeiou]", "8");
        System.out.println("Sostituendo le vocali con il numero 8, otteniamo: " + frase);
    }
}