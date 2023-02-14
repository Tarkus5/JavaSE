/*Il direttore dell’albergo “Java Paradise Resort” deve suggerire attività appropriate agli ospiti
in base al tempo:
In particolare, se:
temperatura è compresa tra i 40 e i 45 gradi: nuoto
se la temperatura è compresa tra i 20 e i 39: tennis
se la temperatura è compresa tra 5 e i 19 gradi: golf
se la temperatura e tra i 4 e i meno 15 gradi: sciare
se la temperatura è maggiore di 45 o minore di 15, stampi "Visita i nostri negozi!".
La temperatura viene determinata tramite random.*/

public class Main {
    public static void main(String[] args) {
        int temperatura = (int) (Math.random() * 50);
        System.out.println("In base alla temperatura di oggi, che è di " + temperatura + "°, ti consigliamo la seguente attività:");
        if (temperatura >= 40 && temperatura <= 45){
            System.out.print("Nuoto");
        } else if (temperatura >= 20 &&  temperatura <= 39) {
            System.out.print("Tennis");
        } else if (temperatura >= 5 && temperatura <= 19) {
            System.out.print("Golf");
        } else if (temperatura >= -15 && temperatura <= 4) {
            System.out.print("Sciare");
        } else if (temperatura > 45 || temperatura < -15) {
            System.out.print("Visita i nostri negozi!");
        }
    }
}