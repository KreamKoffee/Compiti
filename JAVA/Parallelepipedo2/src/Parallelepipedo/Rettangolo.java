package Parallelepipedo;

public class Rettangolo {
	private double base;
	private double altezza;
	
	Rettangolo(double base, double altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	double getBase() { return base;}
	
	double getAltezza() { return altezza; }
	
	double area() {
		return(base * altezza);
	}
	
	

}
