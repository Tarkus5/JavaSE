public class Main {
    public static void main(String[] args) {
        double costi = 5000.75;
        double ricavi = 12500.55;
        double guadagno = 0;
        if (ricavi >= costi){
            System.out.println("OK");
            guadagno = ricavi - costi;
            System.out.println("Hai guadagnato " + guadagno + "€");
        }else {
            System.out.println("Impossibile");
        }
    }
}