public class Computer {
    private String modello, processore;
    private float prezzo;
    private Ram ram;

    //Generiamo il costruttore
    public Computer(String modello, String processore, float prezzo, Ram ram) {
        this.modello = modello;
        this.processore = processore;
        this.prezzo = prezzo;
        this.ram = ram;
    }
    //Generiamo i metodi getter e setter

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    //Generiamo il toString

    @Override
    public String toString() {
        return "Computer{" +
                "modello='" + modello + '\'' +
                ", processore='" + processore + '\'' +
                ", prezzo=" + prezzo +
                ", ram=" + ram +
                '}';
    }
}
