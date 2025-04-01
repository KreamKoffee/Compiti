package Parallelepipedo;

public class Parallelepipedo extends Rettangolo{
	private double profondita;
	
	Parallelepipedo(double base, double altezza, double profondita){
		super(base, altezza);
		this.profondita = profondita;
	}
	
	double getBase() { return super.getBase(); }
	double getAltezza() { return super.getAltezza(); }
	
	

}
