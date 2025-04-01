package es11_pag125;
import java.util.Scanner;

public class es11_pag125 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double spesa;
		double sconto;
		double tot;
		
		System.out.print("inserisci la spesa: ");
		spesa = in.nextDouble();
		
		if (spesa >= 500)
		{
			sconto = spesa*20/100;
			
		}else {
			sconto = spesa*10/100;
		}
		
		tot = spesa - sconto;
		
		System.out.println("lo sconto vale: " +sconto);
		System.out.println("la spesa totale vale: " +tot);
	}

}