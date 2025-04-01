package biblioteca;

public class Libro {
	private String isbn;
	private String titolo;
	private String autore;
	private boolean prestito;


	Libro(String isbn, String titolo, String autore){
		this.isbn=isbn;
		this.titolo=titolo;
		this.autore=autore;
		prestito=false;

	}


	String getIsbn() {

	if(isbn==null) {
		return null;
		}else {
				return isbn;

	}

	String getTitolo() {
		return titolo;}

	String getAutore() {
		return autore;}

	boolean getPrestito() {
		return prestito;}


	boolean prendi() {

	if(prestito) {

	return false;

	}else {

	prestito=true;

	return true;

	}

	}


	boolean restituisci() {

	if(prestito) {

	prestito=false;

	return true;

	}else {

	return false;

	}

	}


	String toS() {

	String s="Isbn: "+isbn+"\nTitolo: "+titolo+"\nAutore: "+autore+"\n";

	if(prestito)

	s=s+"Prestato\n";

	else

	s=s+"Non prestato\n";

	return s;

	}

	}
}
