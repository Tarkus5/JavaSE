import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero decimale");
        float x = scanner.nextFloat();
        System.out.println("Il valore di x è: " + x);
        float y = x / 2.3f;
        System.out.println("Il valore di y è: " + y);
        System.out.println("Il valore di x * y è : " + (x * y));
        System.out.println("Il valore di (x * y) - x è: " + ((x * y) - x));

    }
}