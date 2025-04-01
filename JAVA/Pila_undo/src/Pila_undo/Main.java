package Pila_undo;

public class Main {

	public static void main(String[] args) {
		Azione a1 = new Azione("Scrittura", "Testo digitato nel documento");
		Azione a2 = new Azione("Formato", "Modifica del font del testo");
		Azione a3 = new Azione("Inserimento", "Inserimento di un'immagine");
		Pila p = new Pila(10);
		
		p.push(a1);
		p.push(a2);
		p.push(a3);
		p.stampa();
		p.undo();
		p.stampa();

	}

}
