/*
Creare una Superclasse Libri che avrà i seguenti attributi:
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

public class isLibro {
    //attributi privati e metodi pubblici !!!
    private String titolo, autore, editore;
    private int pagine;

    public isLibro(){
        // costruttore vuoto
    }
    public isLibro(String titolo, String autore, String editore, int pagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
        this.pagine = pagine;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getEditore() {
        return editore;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }
    public int getPagine() {
        return pagine;
    }
    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "isLibro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                ", pagine=" + pagine +
                '}';
    }
}