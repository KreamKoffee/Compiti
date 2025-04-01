package Ufficio_Postale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int scelta;
		
		do {
			System.out.println("1. Prendi biglietto");
			System.out.println("2. Servi cliente");
			System.out.println("3. Stampa");
			System.out.println("4. Fine");
			scelta = in.nextInt();
			
		}while(scelta != 4);

	}

}
