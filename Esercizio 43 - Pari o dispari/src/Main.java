import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un valore intero");
        int x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println(x / 2);
        } else if (x % 2 != 0) {
            System.out.println((x * 3) - 1);
        }
    }
}