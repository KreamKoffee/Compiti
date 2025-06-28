import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contatore = 0;
        int somma = 0;
        int numero;

        System.out.println("Inserisci una sequenza di numeri (0 per terminare):");

        do {
            System.out.print("Numero #" + (contatore + 1) + ": ");
            numero = scanner.nextInt();

            if(numero != 0) {
                contatore++;
                somma += numero;
            }

        } while(numero != 0);

        System.out.println("\nRisultati:");
        System.out.println("Numeri letti (escluso lo zero): " + contatore);
        System.out.println("Somma dei numeri: " + somma);

    }
}