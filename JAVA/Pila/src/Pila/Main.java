package Pila;

public class Main {
	public static void main(String[] args) {
		Pila p = new Pila(5);
		p.push("Andrea");
		p.push("Nicole");
		p.push("Marie");
		p.push("giovanni");
		
		while(p.isEmpty() == false) {
			
			System.out.println(p.pop());
		}
		
	}

}
