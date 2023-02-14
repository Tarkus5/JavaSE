/*Si definisca una classe Contatore.
Un oggetto di questa classe viene usato per contare delle cose, quindi registra il conteggio, che è un numero intero positivo.
Si includano i metodi per assegnare il valore 0 al contatore, per incrementare il contatore di 1 e per decrementarlo di 1.
Ci si assicuri che nessun metodo permetta al contatore di diventare negativo. Si includa, inoltre, un metodo get che restituisca il valore corrente del conteggio
e un metodo che mostri il conteggio a schermo.
Non si definisca un metodo di input.
L’unico metodo che può assegnare valori al contatore è quello che pone il suo valore a 0.
Si scriva un programma per collaudare questa classe.*/
public class Main {
    public static void main(String[] args) {
        Contatore contatore = new Contatore(5);
        Contatore contatore1 = new Contatore(); //Inizializza le variabili
        contatore.mostraConteggio();
        contatore1.mostraConteggio();
        contatore1.decrementa();
        contatore.mostraConteggio();
        /*contatore.aggiungi(); //Incrementa di 1
        contatore.mostraConteggio(); //Stampa 6
        contatore.reset(); //Porta a 0
        contatore.mostraConteggio(); //Stampa 0*/
    }
}