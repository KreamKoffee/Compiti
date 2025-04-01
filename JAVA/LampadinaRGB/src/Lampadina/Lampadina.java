package Lampadina;

public class Lampadina {
    private int potenza;
    private boolean stato;

    Lampadina(int potenza, boolean stato){
        this.potenza=potenza;
        this.stato=stato;
    }

    int getPotenza() {return potenza;}
    boolean getStato() {return stato;}

    void stampa() {
        System.out.println("Potenza: "+potenza+"W");
        if(stato)
            System.out.println("Stato: Accesa");
        else
            System.out.println("Stato: Spenta");
    }

    void accendi() {stato=true;}
    void spegni() {stato=false;}
}

