package cd;

public class CD {
    private int codice;
    private String titolo;
    private String autore;
    private double costo;
    private int numTracce;
    private int traccia;

    public CD(int codice, String titolo, String autore, double costo, int numTracce) {
        this.codice = codice;
        this.titolo = titolo;
        this.autore = autore;
        this.costo = costo;
        this.numTracce = numTracce;
        this.traccia = 0;
    }

    public boolean scegliTraccia(int traccia) {
        if (traccia >= 1 && traccia <= numTracce) {
            this.traccia = traccia;
            return true;
        } else {
            return false;
        }
    }

    public int getTraccia() {
        return traccia;
    }
}
