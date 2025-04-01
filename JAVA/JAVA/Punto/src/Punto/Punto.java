package Punto;

public class Punto {
	double x;
	double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void trasla(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	double calcola_distanza() {
		double distanza;
		distanza = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		return distanza;
	}

}
