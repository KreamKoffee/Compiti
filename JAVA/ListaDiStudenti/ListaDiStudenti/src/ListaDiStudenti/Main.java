package ListaDiStudenti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ListaConcatenata lista = new ListaConcatenata();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n1. Inserisci studente");
            System.out.println("2. Cancella studente per matricola");
            System.out.println("3. Stampa elenco studenti");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci il cognome: ");
                    String cognome = scanner.nextLine();
                    System.out.print("Inserisci la matricola: ");
                    String matricola = scanner.nextLine();
                    Studente studente = new Studente(nome, cognome, matricola);
                    lista.aggiungiStudente(studente);
                    System.out.println("Studente aggiunto con successo!");
                    break;
                case 2:
                    System.out.print("Inserisci la matricola dello studente da cancellare: ");
                    String matricolaDaCancellare = scanner.nextLine();
                    lista.rimuoviStudente(matricolaDaCancellare);
                    break;
                case 3:
                    System.out.println("Elenco studenti:");
                    lista.stampaStudenti();
                    break;
                case 4:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Opzione non valida!");
            }
        } while (scelta != 4);
    }
}
