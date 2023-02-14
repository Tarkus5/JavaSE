public class Main {
    public static void main(String[] args) {
        int variabileControlloUno = 6;
        int variabileControlloDue = 11;
        for (int i = -6; i < variabileControlloUno; i++){
            System.out.println("\nStampo la variabile di controllo uno: " + i);
            for (int j = 0; j < variabileControlloDue; j++){
                System.out.print(j + " ");
            }
        }
        System.out.println("\n\nFINE DEI CICLI");
    }
}