/*
Portiamo all'interno di questa classe un metodo con il codice per andare
a far gestire all'utente la variazione delle percentuali di condizionamento
del lancio della moneta
*/

public class Moneta {
    //Inserendo "condizione" nel metodo, andiamo a variare le percentuali da Main
    public void genera(int condizione){
    //Ci servono due variabili che contano i Testa - Croce usciti
    int testa = 0;
    int croce = 0;
    //Dobbiamo generare 100 lanci. Devono essere realizzati blocchi di 10 segni
        for (int i = 0; i < 100; i++) {
        int generato = (int) (Math.random() * 100);
        if (i % 10 == 0) {
            System.out.println();
        }
        //Ipotizzo una % maggiore per il segno testa (es. 80% T, 20% C)
        if (generato < condizione) {
            croce++;
            System.out.print("T");
        } else {
            testa++;
            System.out.print("C");
        }
    }
    //Stampo i risultati con le percentuali condizionate
        System.out.println("\nTesta: " + testa);
        System.out.printf("Croce: %d ", croce);
    }
}
