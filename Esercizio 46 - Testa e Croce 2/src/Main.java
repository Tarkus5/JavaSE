/*
Scriviamo un applicazione che mi visualizzi per ogni estrazione
su un numero di 100 lanci T se esce testa C se esce croce:
Le T e C devono essere incluse in blocchi da 10 caratteri
es:
TCCCCCCCTC
TTCCCCCCTC
CCCCCCCCCC
CTCCCCCTCC
x 10

Le condizioni di uscita dei della Testa / croce devono essere condizionate
a favore del simbolo Croce: fino a 29 si segna Testa > 30 a 100  si segna croce.

Riportiamo quante Testa e quante Croce sono usciti
es:
Testa: 80
Croce: 20
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
/*        //Ci servono due variabili che contano i Testa - Croce usciti
        int testa = 0;
        int croce = 0;
        //Dobbiamo generare 100 lanci. Devono essere realizzati blocchi di 10 segni
        for (int i = 0; i < 100; i++) {
            int generato = (int) (Math.random() * 100);
            if (i % 10 == 0) {
                System.out.println();
            }
            //Ipotizzo una % maggiore per il segno testa (es. 80% T, 20% C)
            if (generato < 20) {
                croce++;
                System.out.print("T");
            } else {
                testa++;
                System.out.print("C");
            }
        }
        //Stampo i risultati con le percentuali condizionate
        System.out.println("\nTesta: " + testa);
        System.out.printf("Croce: %d ", croce);*/

        //Abbiamo creato l'oggetto moneta
        Moneta moneta = new Moneta();
        System.out.println("Imposta la % di condizionamento dei tiri");
        Scanner scanner = new Scanner(System.in);
        int condizione = scanner.nextInt();
        //Abbiamo richiamato il metodo genera (creato nella classe Moneta)
        //Condizione ci consente d'inserire da scanner una percentuale di uscita di Croce
        moneta.genera(condizione);
    }
}