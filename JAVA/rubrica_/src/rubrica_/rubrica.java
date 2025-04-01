package rubrica_;

public class rubrica {
	private Contatto[] c;
	private int count=0;
	
	rubrica(){
		 c=new Contatto[10];
		count = 0;
	}
	
	boolean addContatto(Contatto a) {
		if(count < 10) {
			c[count]=a;
			count ++;
			return true;}
		else {return false; }
		
	}
	String ricerca(String nome) {
		for(int i=0;i<count;i++) {
			if(nome.equals(c[i].getNome())) {
				return c[i].getTelefono();
			}
		}
		return null;
	}
}
