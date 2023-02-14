/*
Classe computer
- Modello
- Prezzo
- Processore
- RAM

- Metodi get e set per scrivere le proprietà
- Gli oggetti vengono inizializzati dal costruttore
- toString ---> rappresentare lo stato delle variabili (le stampa)
*/


public class Main {
    public static void main(String[] args) {
        //In entrambi i casi abbiamo creato una dipendenza

        //Creo un oggetto PC composto da Computer + RAM
        Computer pcAsus = new Computer("AsusXt1", "AMD", 650.00f, new Ram(8, "Vengeance") );

        //Oppure creo pria la RAM e la inserisco nell'oggetto computer
        Ram ramPC1 = new Ram(16, "Corsair");
        Computer pcHP = new Computer("Hp9526", "I9", 250.00f, ramPC1);

        //Richiamo il metodo toString di computer (pcAsus)
        System.out.println(pcAsus.toString());

        //Se volessi stampare la RAM devo prima prendere il metodo di computer chiamato getRam e su questo applicare getRamGiga
        System.out.println("La RAM del PC è: " + pcAsus.getRam());
    }
}