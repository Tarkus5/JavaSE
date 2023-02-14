import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero decimale");
        double numeroInserito = scanner.nextDouble();
        double y = numeroInserito % 2.0;
        System.out.println("Il numero x è uguale a: " + numeroInserito);
        System.out.println("Il numero y è uguale a: " + y);
        int z = (int) numeroInserito;
        System.out.println("Il numero x è uguale a: " + numeroInserito);
        System.out.println("Il numero z è uguale a: " + z);
        System.out.println("Il numero z % 2 è uguale a: " + (z % 2));
    }
}