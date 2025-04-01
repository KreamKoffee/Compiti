package stampante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Stampante s1 = new Stampante("HP", "LaserJet");
		
		s1.stampa(10, 10, 10, 10);
		
		s1.getCartuccia();
		int[] livelli = s1.getCartuccia();
		System.out.println(livelli);

	}

}
