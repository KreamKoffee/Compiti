package Pila_undo;

public class Azione {
	private String nome;
	private String descrizione;
	
	Azione(String nome, String descrizione){
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	String getNome() {
		return nome;
	}
	
	String getDescrizione() {
		return descrizione;
	}
	
	void stampa() {
		System.out.println(nome +"-"+ descrizione);
	}
	
	String toS() {
		String s = nome + " - " + descrizione + "\n";
		return s;
	}
		
}
