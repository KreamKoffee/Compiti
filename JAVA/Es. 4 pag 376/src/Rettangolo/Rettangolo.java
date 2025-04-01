package Rettangolo;

public class Rettangolo {
    double base;
    double altezza;
    double perimetro;
    double area;

    Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    void perimetro(){
        this.perimetro = (this.altezza + this.base)*2;
        System.out.println("Il perimetro vale: " + this.perimetro);
    }

    void area(){
        this.area = this.altezza * this.base;
        System.out.println("L'area vale: " + this.area);
    }
}
