package rubrica_;

public class Contatto {
	private String nome;
	private String telefono;
	
	Contatto(String nome,String telefono){
		this.nome=nome;
		this.telefono=telefono;
	}
	
	String getNome(){
		return nome;
	}
	String getTelefono(){
		return telefono;
	}
	

}
