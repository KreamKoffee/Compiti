package libro;

public class libro {
	private String ISBN;
	private String titolo;
	private String autore;
	private boolean prestito;
	
	libro(String ISBN, String titolo, String autore){
		this.ISBN=ISBN;
		this.titolo=titolo;
		this.autore=autore;
	}
	public String getISBN(){
		return ISBN;	
	}
	
	public String geTitolo() {
		return titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public boolean prendi_in_presto() {
		if(prestito==false) {
			prestito= true;
			return true;
		}else {
			prestito=true;
			return false;
		}
	}
		
	public boolean restituisci() {
		if(prestito==true) {
			prestito=false;
			return false;
		}else {
			
			return true;
		}
	}
	
	String to_String() 
	{
		
		String S="ISBN: " +ISBN+ "Autore: " +autore+ "Titolo: " +titolo+ "Stato libro: ";
		
		if(prestito==false) {
			S += "il libro è in biblioteca";
		}
		else
		{
			S += "il libro ce l'ha qualcuno";
		}
		return S;
	}
	public boolean getPrestito() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
