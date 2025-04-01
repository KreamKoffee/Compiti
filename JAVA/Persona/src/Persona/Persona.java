package Persona;

public class Persona {
	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	String getNome() {
		return nome;
	}
	
	String getCognome() {
		return cognome;
	}
	
	void stampa() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " +cognome);
	}

}
