package Punto1;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto(double x) {
		this.x = x;
		this.y = 0;
	}
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public double getx() {
		return(x);
	}
	
	public double gety() {
		return(y);
	}
	
	public void trasla(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double distanza() {
		double d;
		d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return(d);
	}
	
	public void stampa() {
		System.out.println("X:" + x + "," + "Y:" + y);
		System.out.println("La distanza dall'origine vale: " + d);
	}
}
