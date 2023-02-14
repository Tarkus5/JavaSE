public class Ram {
    private int ramGiga;
    private String ramModello;
    //Costruttore per inizializzre le variabili al momento della creazione degli oggetti
    public Ram(int ramGiga, String ramModello) {
        this.ramGiga = ramGiga;
        this.ramModello = ramModello;
    }
    //Per ogni variabile privata ci sono i metodi getter e setter
    public int getRamGiga() {
        return ramGiga;
    }

    public void setRamGiga(int ramGiga) {
        this.ramGiga = ramGiga;
    }

    public String getRamModello() {
        return ramModello;
    }

    public void setRamModello(String ramModello) {
        this.ramModello = ramModello;
    }
    //Metodo toString per stampare le proprietà della RAM
    @Override
    public String toString() {
        return "Ram{" +
                "ramGiga=" + ramGiga +
                ", ramModello='" + ramModello + '\'' +
                '}';
    }
}
