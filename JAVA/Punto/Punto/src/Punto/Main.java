package Punto;

public class Main {
	public static void main(String[] args) {
		Punto p1 = new Punto(3,4);
		p1.trasla(10, 1);
		
		System.out.println(p1.calcola_distanza());
	}

}
