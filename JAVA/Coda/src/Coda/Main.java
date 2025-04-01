package Coda;

public class Main {

	public static void main(String[] args) {
		Coda c = new Coda(7);
		c.enqueue(10);
		c.enqueue(20);
		c.enqueue(30);
		c.enqueue(40);
		c.dequeue();
		c.enqueue(50);
		c.stampa();

	}

}
