import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int numero = scanner.nextInt();
        if (numero > 10){
            System.out.println("Alto");
        } else if (numero < 5) {
            System.out.println("Basso");
        }else {
            System.out.println("Medio");
        }
    }
}