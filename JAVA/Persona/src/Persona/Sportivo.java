package Persona;

public class Sportivo extends Persona {
	private String sport;
	
	Sportivo(String nome, String cognome, String sport){
		super(nome, cognome);
		this.sport = sport;
	}
	
	String getSport() {
		return sport;
	}
	
	void stampa() {
		super.stampa();
		System.out.println("Sport: " +sport);
	}

}
