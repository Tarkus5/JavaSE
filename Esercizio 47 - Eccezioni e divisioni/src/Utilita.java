import java.util.InputMismatchException;
import java.util.Scanner;

/*
Scrivere un programma che permetta all’utente di calcolare il resto di una
divisione fra due valori interi.  Il resto della divisione di x/y è x%y.
Catturare qualsiasi tipo di eccezione che può essere lanciata e
fare in modo che l’utente possa inserire nuovi valori.
Strutturiamo il programma con una classe ("Utilita") che contiene un
metodo (restoDiv) che fa questo lavoro.

a) gestendo tutto nel metodo
b) rilanciando all'esterno
*/
public class Utilita {
    Scanner scanner = new Scanner(System.in);
    int dividendo;
    int divisore;
    int giusto = 0;

    public void restoDiv() {
        //Acquisiamo in input due valori interi
        do {
            try {
                System.out.println("Inserisci il valore del dividendo");
                dividendo = scanner.nextInt();
                System.out.println("Inserisci il valore del divisore");
                divisore = scanner.nextInt();
                int risultatoDivisione = dividendo / divisore;
                int restoDivisione = dividendo % divisore;
                System.out.printf("Il risultato della divisione tra %d e %d è %d", dividendo, divisore, risultatoDivisione);
                System.out.printf("\nIl resto della divisione tra %d e %d è %d", dividendo, divisore, restoDivisione);
                giusto++;
            } catch (InputMismatchException ex) {
                System.out.println("Errore: occorre inserire due valori interi");
                scanner.next();
            }

            //Usiamo questi valori in una divisione ottenendo il resto
            catch (ArithmeticException ex) {
                System.out.println("\nErrore: hai inserito un valore scorretto");
                System.out.println("Dettaglio errore: " + ex.getMessage());
            }
        } while (giusto == 0);
    }
}
