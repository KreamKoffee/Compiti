package Lampadina;

public class LampadinaRGB extends LampadinaRegola{
    private int verde;
    private int blu;
    private int rosso;

    LampadinaRGB(int potenza, boolean stato, int sp, int verde, int blu, int rosso){
        super(potenza, stato, sp);
        this.verde=verde;
        this.blu=blu;
        this.rosso=rosso;
    }

    void stampa() {
        super.stampa();
        System.out.println("Colore: "+rosso+","+verde+","+blu);
    }

    void regolaColore(int v, int b, int r) {
        verde=v;
        blu=b;
        rosso=r;
    }
}
