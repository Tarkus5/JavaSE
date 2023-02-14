import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la velocità");
        int velocita = scanner.nextInt();
        System.out.println("Inserisci la visibilità");
        int visibilita = scanner.nextInt();
        if (velocita > 25 && visibilita < 30){
            System.out.println("Attenzione!");
        } else if (velocita < 0 || visibilita < 0) {
            System.out.println("Informazioni inserite non valide");
        } else {
            System.out.println("Nessuna difficoltà ma guida con prudenza!");
        }
    }
}