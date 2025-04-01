package Lampadina;

public class LampadinaRegola extends Lampadina {
    private int sp;

    LampadinaRegola(int potenza, boolean stato, int sp) {
        super(potenza, stato);
        this.sp = sp;
    }

    int getSp() {
        return sp;
    }

    void stampa() {
        super.stampa();
        System.out.println("Potenza in uso: " + sp);
    }

    void regola(int p) {
        sp = p;
    }
}
