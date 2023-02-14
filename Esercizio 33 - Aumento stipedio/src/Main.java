/*Realizzare un programma per determinare, dopo aver inserito da terminale lo stipendio
annuale (es. 15.414,74 ), l'aumento e il nuovo stipendio di un dipendente tramite le
istruzioni if... else con le quali calcolare l’aumento rispetto allo stipendio base.
In particolare l'input al programma include l'attuale stipendio annuo per il dipendente e un
numero che indica la valutazione della performance (1=eccellente, 2=buona e 3=scarsa). Un
dipendente con una valutazione di 1 riceverà un aumento del 6%, un
un dipendente con una valutazione di 2 riceverà un aumento del 4% e uno con una
valutazione di 3 riceverà un aumento dell'1,5%.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo stipendio annuale");
        float stipendio = scanner.nextFloat();
        System.out.println("Inserisci la valutazione della tua performance (1-2-3)");
        int performance = scanner.nextInt();
        float performanceEccellente = 0.06f;
        float performanceBuona = 0.04f;
        float performanceScarsa = 0.015f;
        if (performance == 1){
            System.out.println("Il tuo nuovo stipendio è di " + (stipendio + (stipendio * performanceEccellente)));
        } else if (performance == 2) {
            System.out.println("Il tuo nuovo stipendio è di " + (stipendio + (stipendio * performanceBuona)));
        } else if (performance == 3) {
            System.out.println("Il tuo nuovo stipendio è di " + (stipendio + (stipendio * performanceScarsa)));
        }else {
            System.out.println("Hai inserito una valutazione errata");
        }
    }
}