public class Main {
    public static void main(String[] args) {
        //Inizializzo l'array
        int[] temperatureSettimana = new int[7];
        //Popolo l'array con il metodo Math.random()
        for (int i = 0; i < temperatureSettimana.length; i++){
            temperatureSettimana[i] = (int) (Math.random() * 50);
        }
        //Stampo il contenuto dell'array
        System.out.println("Previsioni del tempo per la prossima settimana: ");
        for (int i = 0; i < temperatureSettimana.length; i++){
            System.out.print(temperatureSettimana[i] + "° ");
        }
        System.out.println("\n");
        for (int i = 0; i < temperatureSettimana.length; i++){
            if (temperatureSettimana[i] >= 40 && temperatureSettimana[i] <= 45){
                System.out.println("Oggi ci sono " + temperatureSettimana[i] + "°. L'attività consigliata per oggi è il nuoto");
            }
            if (temperatureSettimana[i] >= 20 && temperatureSettimana[i] <= 39){
                System.out.println("Oggi ci sono " + temperatureSettimana[i] + "°. L'attività consigliata per oggi è il tennis");
            }
            if (temperatureSettimana[i] >= 5 && temperatureSettimana[i] <= 19){
                System.out.println("Oggi ci sono " + temperatureSettimana[i] + "°. L'attività consigliata per oggi è il golf");
            }
            if (temperatureSettimana[i] >= -15 && temperatureSettimana[i] <= 4){
                System.out.println("Oggi ci sono " + temperatureSettimana[i] + "°. L'attività consigliata per oggi è lo sci");
            }
            if (temperatureSettimana[i] > 45 || temperatureSettimana[i] < -15){
                System.out.println("Oggi ci sono " + temperatureSettimana[i] + "°. L'attività consigliata per oggi è visitare i nostri negozi");
            }
        }
    }
}