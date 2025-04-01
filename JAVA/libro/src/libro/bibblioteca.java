package libro;

public class bibblioteca {
	
	private libro[] catalogo; 
	private int numLibri;
	
	public bibblioteca()
	{
		numLibri = 0;
		catalogo=new libro[10];
		
	}
	
	public boolean addLibro( libro L)
	{
		if(numLibri<10) {
			catalogo[numLibri]=L;
			numLibri++;
			return true;
		}else {
			return false;
		}
	}
	public int prendi_in_presto(String ISBN) {
		for(int i=0; i<numLibri; i++) {
			if(ISBN.equals(catalogo[i].getISBN())) {
				if(catalogo[i].getPrestito()==false) {
					catalogo[i].prendi_in_presto();
					return 0;
				}else {
					return 1;
				}
			}
		}
		return 2;
	}
	
	public int restituisci(String ISBN) {
		for(int i=0; i<numLibri; i++) {
			if(ISBN.equals(catalogo[i].getISBN())) {
				if(catalogo[i].getPrestito()==true) {
					catalogo[i].restituisci();
					return 0;
				}else {
					return 1;
				}
			}
		}
		return 2;
	}
	
	
}
	
	
	
