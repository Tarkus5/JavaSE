/*
Scrivi un programma che fissate in delle variabili le vendite giornaliere per cinque negozi[magari
inserite in un array, oppure usando una variabile per ogni negozio]], visualizzi un grafico fatto, per
ogni negozio, come una riga di asterischi, dove ogni asterisco dovrebbe rappresentare € 100 di
vendite.
esempio
negozio 1: ************
negozio 2: ******
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo la scanner e l'array per inserire le vendite dei negozi da terminale
        Scanner scanner = new Scanner(System.in);
        float[] vendite = new float[5];
        //Popolo l'array da scanner
        System.out.println("Inserisci i valori richiesti");
        for (int i = 0; i < vendite.length; i++) {
            System.out.println("Inserisci il guadagno del negozio " + (i + 1));
            vendite[i] = scanner.nextFloat();
        }
        //Prova stampa valori inseriti
        System.out.println("I guadagni inseriti sono:");
        for (float guadagno : vendite) {
            System.out.println(guadagno + " ");
        }
        System.out.println();
        //Creo il ciclo per stampare il grafico (inizializzo la variabile per il controllo)
        /*
            float variabileControllo = vendite[4] / 100;
            for (int negozio = 0; negozio < vendite.length; negozio++){
            System.out.println("Guadagno negozio " + negozio + ": ");
            if (variabileControllo < 10){
                System.out.println("*");
            Questa istruzione stampa sempre un numero di asterischi uguali per
            tutti i negozi perchè il suo valore è ottenuto dividendo l'ultimo
            dato inserito nell'array con 100.
            Quindi se nella posizione 4 dell'array viene inserito 10500 dividendo
            per 100 otteniamo 105. Poi con l'if si è stabilito che:
            - se il valore ottenuto e < di 10 si stampa un asterisco
            - altrimenti non stama nulla.
            Quindi (in questo caso) non ci troviamo stamapto un asterisco perche la
            variabile variabileControllo ha un valore  di 105 e la condizione:
              (variabileControllo < 10) è falsa.
              Inserendo un valore di 900 invece ci triviamo un solo asterisco.
            }
        }
        */
        // creaimo un ciclo che legge i valori dell'array per le posizioni che vanno
        //    da 0 a 4
        for (int negozio = 0; negozio < vendite.length; negozio++) {
            System.out.print("\nGuadagno negozio " + (negozio + 1) + ": "); //negozio + 1 ci da numeri che partono da 1

            // dividiamo il valore contenuto nella i-esima posizione dell'array con 100 e otteniamo quanti asterischi stampare
            int variabileControllo = (int) (vendite[negozio] / 100);

            // con un ciclo for stampiamo gli asterischi
            // il ciclo viene attivato tente volte quanti sono gli asterischi da stampare.
            // stampato l'ultimo aterisco esce dal for e rientra nel for esterno dove viene
            // eseguita l'poperazione di determianre il numero di asterischi e la stampa per
            // i valori contenuti nel secondo negozio   (posizione  1  dell'array)
            for (int i = 0; i < variabileControllo; i++)
                System.out.print("*");
        } // si esce dal for perche si è letto l'ultimo valore (quarta posizione) dell'array

    }
}