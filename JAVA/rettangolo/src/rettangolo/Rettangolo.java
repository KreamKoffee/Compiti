package rettangolo;

public class Rettangolo {
	double base;
	double altezza;
	double perimetro;
	double area;
	
	Rettangolo(double base, double altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	void perimetro() {
		this.perimetro = (this.base + this.altezza)*2;
	}
	
	void area() {
		this.area = this.base * this.altezza;
	}

}
