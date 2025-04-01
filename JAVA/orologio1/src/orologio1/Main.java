package orologio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ore, min, sec;
        Orologio orologio1 = new Orologio();
        orologio1.stampa();

        System.out.print("inserisci l'ora: ");
        ore = in.nextInt();
        System.out.print("inserisci i minuti: ");
        min = in.nextInt();
        System.out.print("inserisci i secondi: ");
        sec = in.nextInt();

        Orologio orologio2 = new Orologio(ore, min, sec);
        orologio2.stampa();
        
        
        
        
         
        	
        	try {
        		while(true) {
        		Thread.sleep(1000);
				orologio1.aggiorna();
				orologio1.stampa();
        		}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        

        

        orologio2.aggiorna();
        orologio2.stampa();
    }
}
