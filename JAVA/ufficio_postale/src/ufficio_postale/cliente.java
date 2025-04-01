package Ufficio_Postale;

public class Cliente {
	private String nome;
	private String cognome;
	private String tel;
	private int num;
	
	Cliente(String nome, String cognome, String tel, int num){
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.num = num;
	}
	
	String getNome() {
		return nome;
	}
	
	String getCognome() {
		return cognome;
	}
	
	String getTel() {
		return tel;
	}
	
	int getNum() {
		return num;
	}
	
	String toS() {
		String s = "Nome: "+nome+"\n";
		s = s+"Cognome: " +cognome+"\n";
		s = s+"Telefono: " +tel+"\n";
		s = s+"Numero: "+num+"\n";
		return s;
	}
	

}
