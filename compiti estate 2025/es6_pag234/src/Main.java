import java.util.Scanner;

public class Main {
    public static void manin(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("stabilire se si inserisce il raggio del cerchio (r) o il lato (l) : ");
        String scelta = scanner.nextLine();
        if (scelta.equals("r")) {
            System.out.print("inserisci il raggio del cerchio: ");
            double raggio = scanner.nextDouble();
            if (raggio < 0) {
                System.out.println("Il raggio non può essere negativo.");
                return;
            }
            double area = Math.PI * raggio * raggio;
            System.out.println("L'area del cerchio è: " + area);
        } else if (scelta.equals("l")) {
            System.out.print("inserisci il lato del quadrato: ");
            double lato = scanner.nextDouble();
            if (lato < 0) {
                System.out.println("Il lato non può essere negativo.");
                return;
            }
            double area = lato * lato;
            System.out.println("L'area del quadrato è: " + area);
        } else {
            System.out.println("Scelta non valida. Inserisci 'r' per il raggio o 'l' per il lato.");
        }
    }
}