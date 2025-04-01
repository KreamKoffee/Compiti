package auto;

public class main {

	public static void main(String[] args) {
		Auto A1 = new Auto("ferrari", "#fcc0cb", 3500, 6);
		Auto A2 = new Auto("Nick", "rosa", 10000, 50);
		Auto A3 = new Auto("Amir", "nero", 900, 6);
		A1.accendi();
		A2.accendi();
		A3.accendi();
		if(A1.cambia()) 
			System.out.println("Marcia cambiata");
		else {
			System.out.println("Impossibile cambiare marcia");
		}
		
		if(A1.cambia()) 
			System.out.println("Marcia cambiata");
		else {
			System.out.println("Impossibile cambiare marcia");
		}
		
		if(A1.cambia()) 
			System.out.println("Marcia cambiata");
		else {
			System.out.println("Impossibile cambiare marcia");
		} 
		
		//stampa cose dell'auto A1
		
		System.out.println("Marca: " + A1.marca);
		System.out.println("Colore: " + A1.colore);
		System.out.println("Cilindrata: " + A1.cilindrata);
		System.out.println("Numero marce: " + A1.marcia);
		if (A1.accesa_spenta) {
			System.out.println("Auto accesa");
		}else {
			System.out.println("Auto spenta");
		}
		
		System.out.println("Marcia corrente: " + A1.marcia);
		

	}

}
