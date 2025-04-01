package Persona;

public class Calciatore extends Sportivo{
	private String squadra;
	private String ruolo;
	
	Calciatore(String nome, String cognome, String sport, String squadra, String ruolo){
		super(nome, cognome, sport);
		this.squadra = squadra;
		this.ruolo = ruolo;
	}
	
	String getRuolo() { return ruolo;}
	
	String getSquadra() { return squadra;}
	
	void stampa() {
		super.stampa();
		System.out.println("Squadra: " +squadra);
		System.out.println("Ruolo: " +ruolo);
	}
}
