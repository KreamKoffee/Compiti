package pila1;

public class pila {
	private String[] vet;
	private int free;
	
	pila(int dim){
		free = 0;
		vet = new String[dim];
	}
	
	String pop() {
		
		if(free==0) {
			return null;
		}else {
			free-=1;
			String str = vet[free];
			return str;
		}
		
	}
	
	String top() {
		if(vet[free] == null) {
			return null;
		}else {
			String str = vet[free-1];
			return str;
		}
	}
	
	void empty() {
		free = 0;
	}
	
	boolean isEmpty() {
		if(free == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean push(String str) {
		
		if(free < vet.length) {
			vet[free] = str;
			free++;
			return true;
		}else {
			return false;
		}
		
	}
}

