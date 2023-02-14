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

public class Main {
    public static void main(String[] args) {
/*      int dividendo = 100;
        int divisore = 0;
        int resto;
        int risultato;
        try {
            risultato = dividendo / divisore;
            resto = dividendo % divisore;
            System.out.println("Il risultato della divisione è " + risultato);
            System.out.println("Il resto della divisione è " + resto);
        }
        catch (ArithmeticException ex){
            System.out.println("Errore: hai inserito un valore non valido");
            System.out.println("Dettaglio errore: " + ex.getMessage());
        }*/
        Utilita utilita = new Utilita();
        utilita.restoDiv();
    }
}