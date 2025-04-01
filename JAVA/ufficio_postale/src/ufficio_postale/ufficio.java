package Ufficio_Postale;

public class Ufficio {
	
	private int head;
	private int tail;
	private Cliente[] vet;
	private int numele;
	
	Ufficio(int dim){
		this.head=0;
		this.tail=0;
		this.numele=0;
		vet = new Cliente [dim];
	}

	public boolean isempty() {
		if(numele==0) {
			return true;
		}
		return false;
	}

	
	public boolean isfull() {
		if(vet.length==numele) {
			return true;
		}
		return false;
	}
	
	boolean enqueue(Cliente elem) {
		if(!isfull()) {
			vet[tail]=elem;
			tail=(tail+1)%vet.length;
			numele++;
			return true;
		}
		return false;
	}
	
	Cliente dequeue() {
		if(numele==0) {
			return null;
		}else {
			Cliente temp=vet[head];
			head=(head+1)%vet.length;
			numele--;
			return temp;
		}
		
	}
	
	void stampa() {
		
		for(int i=0; i<numele; i++) {
			int j=(head+i)%vet.length;
			System.out.println(j+"-"+vet[j].toS());
		}
	}
	
	
	
	
}
