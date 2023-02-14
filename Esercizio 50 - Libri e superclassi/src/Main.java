/*
Creare una superclasse Libri che avrà i seguenti attributi:
- Titolo
- Autore
- Editore
- pagine

Creiamo da questo libro un libro specifico con l'aggiunta di:
- prezzoVendita
- metodo che sfoglia le pagine

Il metodo dovrà aggiornare il numero di pagine da leggere
per finire il libro leggendo il parametro dell'ultima pagina letta
*/

public class Main {
    public static void main(String[] args) {
        isLibri libro = new isLibri();
        System.out.println(libro.getPagine());
        libro.setPagine(10);
        System.out.println(libro.getPagine());
        //Ho derivato una sottoclasse che ha tutti i metodi pubblici della Superclasse
        Libro libroChimica = new Libro("Chimica", "Rossi", "Minerva", 150, 15.90, 5);
        libroChimica.setTitolo("Chimica");

    }
}