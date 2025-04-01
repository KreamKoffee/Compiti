package Punto1;

import java.util.Scanner;

public class main {
	
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Punto p1 = new Punto();
		double x,y;
		
		System.out.print("inserisci la x: ");
		x = in.nextDouble();
		
		Punto p2 = new Punto(x,y);
		
		p1.trasla(10,3);
		

	}

}
