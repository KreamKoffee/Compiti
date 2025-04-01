package threadcase;

public class ThreadCase extends Thread{
    double metriquadri;
    double altezza;
    double larghezza;
    double lunghezza;
    String via;
    double costo;

    public ThreadCase(String via, double costo, double lunghezza, double larghezza, double altezza){
        this.via = via;
        this.costo = costo;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;

    }

    void metriq(){
        this.metriquadri = this.larghezza * this.lunghezza;
    }

    public void run(){
        System.out.println("Via: " + this.via);
        System.out.println("Costo: " + this.costo);
        System.out.println("Lunghezza: " + this.lunghezza);
        System.out.println("Larghezza: " + this.larghezza);
        System.out.println("Metriquadri: " + this.metriquadri);
        System.out.println("Altezza: " + this.altezza);
    }
}
