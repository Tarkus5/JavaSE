import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero decimale");
        float x = scanner.nextFloat();
        int y = (int) x;
        System.out.println("Il numero inserito è: " + x);
        System.out.println("Ho trasformato il primo numero in intero, con risultato: " + y);
        byte z = (byte) x;
        System.out.println("Il valore del primo numero in byte è: " + z);

    }
}
