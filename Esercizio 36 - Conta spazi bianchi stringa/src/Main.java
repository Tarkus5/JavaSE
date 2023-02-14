import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dichiaro le varibiali
        String frase;
        int spazi = 0;
        //Dichiaro lo scanner per inserimento della stringa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la frase da conteggiare");
        frase = scanner.nextLine();
        //Creo il ciclo per la conta degli spazi
        for (int i = 0; i < frase.length(); i++){
            char carattere = frase.charAt(i);
            if (carattere == ' '){
                spazi++;
            }
        }
        System.out.println("Nella tua frase ci sono " + spazi + " spazi");
    }
}