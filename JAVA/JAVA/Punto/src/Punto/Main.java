package Punto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Punto p1 = new Punto(3,4);
		p1.trasla(10, 1);
		
		System.out.println(p1.calcola_distanza());
	}

}
