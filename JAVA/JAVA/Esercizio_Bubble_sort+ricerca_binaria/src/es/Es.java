package es;

import java.util.Scanner;

public class Es {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int scelta;
		int[] v = new int[10];
		boolean caricato = false;
		boolean ordinato = false;
		
		do {
			System.out.println("1. generare 10 numeri interi  casuali compresi fra 1 e 100 e memorizzarli in un vettore");
			System.out.println("2. effettuare l'ordinamento");
			System.out.println("3. ricercare un valore ricevuto da tastiera");
			System.out.println("4. fine");
			
			switch(scelta) {
			case 1:
				carica(v);
				caricato = true;
				break;
				
			case 2:
				if (caricato) {
					ordina(v);
				}else {
					System.out.println("non è stato caricato nessun dato");
					
				}
				break;
				
			case 3:
				if (caricato && ordinato) {
					ordina(v);
				}else {
					if(caricato == false) {
						System.out.println("non è stato caricato nessun dato");
					}else {
						System.out.println("il vettore non è stato ordinato");
					}
					
					
				}
				break;
				
			case 4:
				break;
				
			}
		}while(scelta < 1 || scelta > 4);

	}
	
	static void carica(int[] v) {
		for(int g=0; g<v.length; g++) {
			v[g] = 1+(int)Math.random()*100;
		}
	}
	
	static void ordina(int[] v) {
		
	}

}
