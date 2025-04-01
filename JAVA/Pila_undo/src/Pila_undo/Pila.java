package Pila_undo;

public class Pila {
	private Azione[] vet;
	private int free;
	
	Pila(int dim){
		free = 0;
		vet = new Azione[dim];
	}
	
	Azione pop() {
		
		if(free == 0) {
			return null;
		}else {
			free--;
			Azione act = vet[free];
			return act;
		}
		
	}
	
	Azione top() {
		if(vet[free] == null) {
			return null;
		}else {
			Azione act = vet[free-1];
			return act;
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
	
	boolean push(Azione act) {
		
		if(free < vet.length) {
			vet[free] = act;
			free++;
			return true;
		}else {
			return false;
		}
		
	}
	
	Boolean undo() {
		if(free == 0) {
			return false;
		}else {
			free --;
			return true;
		}
	}
	
	void stampa() {
		for(int h=free-1; h>=0; h--) {
			vet[h].stampa();
		}
	}
	
	String toS() {
		String s = "";
		for (int i =0; i<free; i++) {
			s = s+vet[i].toS();
		}
		return s;
	}
}
