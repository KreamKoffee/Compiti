import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dei due operandi
        System.out.print("Inserisci il primo numero: ");
        double operando1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double operando2 = scanner.nextDouble();

        int scelta;
        do {
            // Visualizzazione menu
            System.out.println("\nMenu Operazioni:");
            System.out.println("1. Addizione");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();

            switch(scelta) {
                case 1:
                    System.out.println("Risultato: " + (operando1 + operando2));
                    break;
                case 2:
                    System.out.println("Risultato: " + (operando1 - operando2));
                    break;
                case 3:
                    System.out.println("Risultato: " + (operando1 * operando2));
                    break;
                case 4:
                    if(operando2 != 0) {
                        System.out.println("Risultato: " + (operando1 / operando2));
                    } else {
                        System.out.println("Errore: Divisione per zero!");
                    }
                    break;
                case 0:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Errore: Scelta non valida!");
            }
        } while(scelta != 0);

        scanner.close();
    }
}