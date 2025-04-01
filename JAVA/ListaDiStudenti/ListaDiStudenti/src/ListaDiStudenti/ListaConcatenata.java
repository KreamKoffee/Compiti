package ListaDiStudenti;

public class ListaConcatenata {
    private Nodo testa;

    ListaConcatenata() {
        this.testa = null;
    }


    public void aggiungiStudente(Studente studente) {
        Nodo nuovoNodo = new Nodo(studente);
        if (testa == null) {
            testa = nuovoNodo;
        } else {
            Nodo corrente = testa;
            while (corrente.next != null) {
                corrente = corrente.next;
            }
            corrente.next = nuovoNodo;
        }
    }

    public void rimuoviStudente(String matricola) {
        if (testa == null) {
            System.out.println("Lista vuota, nessuno studente da rimuovere.");
            return;
        }


        if (testa.studente.getMatricola().equals(matricola)) {
            testa = testa.next;
            System.out.println("Studente rimosso con successo.");
            return;
        }

        Nodo corrente = testa;
        while (corrente.next != null && !corrente.next.studente.getMatricola().equals(matricola)) {
            corrente = corrente.next;
        }

        if (corrente.next != null) {
            corrente.next = corrente.next.next;
            System.out.println("Studente rimosso con successo.");
        } else {
            System.out.println("Nessuno studente trovato con questa matricola.");
        }
    }

    public void stampaStudenti() {
        if (testa == null) {
            System.out.println("Nessuno studente presente nella lista.");
            return;
        }

        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente.studente);
            corrente = corrente.next;
        }
    }
}

