
/**
 @author Alessandro Romano
 @version 1.0
 La classe implementa un contatore con metodi di incremento e decremento
 */
public class Contatore {
    /*
    UML
    -------------
    Contatore
    -------------
    - conteggio: int (- davanti = privato)
    -------------
    + reset: void (+ davanti = pubblico)
    + aggiungi: void
    + decrementa: void [decrementa il valore di una unità ma non va mai sotto 0]
    + mostraConteggio: void
    */
    private static int conteggio;

    //Creiamo due costruttori
    //Costruttore senza parametri
    public Contatore() {
    }
    //Costruttore con parametri
    public Contatore(int conteggio) {
        this.conteggio = conteggio;
    }

    public void reset() {
        this.conteggio = 0;
        System.out.println("Azzero il contatore");
    }

    //Aggiungo +1 su ogni chiamata del metodo
    public void aggiungi() {
        this.conteggio++;
    }

    //Decrementa (ma non va mai sotto 0)
    public void decrementa() {
        if (conteggio > 0) {
            this.conteggio--;
        }
    }

    //Mostro il conteggio
    public void mostraConteggio() {
        System.out.printf("Il conteggio attuale è di %d %n", conteggio);
    }
}
