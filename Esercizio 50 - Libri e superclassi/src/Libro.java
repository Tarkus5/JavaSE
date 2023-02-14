public class Libro extends isLibri {
    private double prezzo;
    private int pagineLette;
    //Ho importato tutto tranne i costruttori
    //Così importiamo anche il costruttore (composto dal costruttore della
    //Superclasse e dal costruttore con i nuovi metodi prezzo e pagineLette)
    public Libro(String titolo, String autore, String editore, int pagine, double prezzo, int pagineLette) {
        super(titolo, autore, editore, pagine);
        this.prezzo = prezzo;
        this.pagineLette = pagineLette;
    }
}
