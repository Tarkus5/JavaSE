import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un valore intero");
        int punteggio = scanner.nextInt();
        if (punteggio >= 0 && punteggio <= 100){
            System.out.println("Il valore inserito è valido!");
        } else {
            System.out.println("Il valore inserito non è valido.");
        }
    }
}