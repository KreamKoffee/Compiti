package Coda;

public class Coda {
	
	private int head;
	private int tail;
	private int[] vet;
	private int numele;
	
	Coda(int dim){
		this.head=0;
		this.tail=0;
		this.numele=0;
		vet = new int [dim];
	}
	//controlla se è vuoto
	public boolean isempty() {
		if(numele==0) {
			return true;
		}
		return false;
	}
	
	//controlla se è pieno
	public boolean isfull() {
		if(vet.length==numele) {
			return true;
		}
		return false;
	}
	//inserisci
	boolean enqueue(int elem) {
		if(!isfull()) {
			vet[tail]=elem;
			tail=(tail+1)%vet.length;
			numele++;
			return true;
		}
		return false;
	}
	//togli dalla coda e ritorna il valore
	int dequeue() {
		if(numele==0) {
			return 0;
		}else {
			int temp=vet[head];
			head=(head+1)%vet.length;
			numele--;
			return temp;
		}
		
	}
	
	void stampa() {
		for(int i=0; i<numele; i++) {
			int j=(head+i)%vet.length;
			System.out.println(vet[j]);
		}
	}
}
