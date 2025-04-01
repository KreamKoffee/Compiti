package ListaDiStudenti;

public class Nodo {
    Studente studente;
    Nodo next;

    Nodo(Studente studente) {
        this.studente = studente;
        this.next = null;
    }
}

