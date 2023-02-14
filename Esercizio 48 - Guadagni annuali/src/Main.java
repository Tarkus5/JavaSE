public class Main {
    public static void main(String[] args) {
        int[][] arrayFatturato = {
                {120, 125, 180, 140},
                {178, 134, 141, 135},
                {149, 178, 134, 130}
        };
        System.out.println("Calcolo i fatturati aziendali degli ultimi anni");
        int anno = 2020; //Andremo a incrementare questa variabile al variare dell'anno
        int somma = 0;
        //Vado a sommare i valori, andando a ottenere il totale della riga
        for (int righe = 0; righe < arrayFatturato.length; righe++){
            for (int colonne = 0; colonne < arrayFatturato[righe].length; colonne++){
                //Calcolo il totale di ogni singola riga
                somma = somma + arrayFatturato[righe][colonne];
            }
            //Stampo i risultati del ciclo interno
            System.out.println("Il fatturato del " + anno + " è di: " + somma);
            //Riporto il valore di somma a 0, altrimenti fa somme progressive
            somma = 0;
            //Incremento l'anno
            anno++;
        }
    }
}