import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PREZZO_COTONE = 10;
        int PREZZO_PELLE = 25;
        int PREZZO_NEOPRENE = 30;

        int quantitaCotone = 0;
        int quantitaPelle = 0;
        int quantitaNeoprene = 0;

        System.out.print("Inserisci il numero di ordini da effettuare: ");
        int numeroOrdini = scanner.nextInt();

        for (int i = 1; i <= numeroOrdini; i++) {
            System.out.println("\nOrdine #" + i);
            System.out.println("Scegli il tipo di guanto:");
            System.out.println("1. Cotone (€10)");
            System.out.println("2. Pelle (€25)");
            System.out.println("3. Neoprene (€30)");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            System.out.print("Quantità: ");
            int quantita = scanner.nextInt();

            switch (scelta) {
                case 1:
                    quantitaCotone += quantita;
                    break;
                case 2:
                    quantitaPelle += quantita;
                    break;
                case 3:
                    quantitaNeoprene += quantita;
                    break;
                default:
                    System.out.println("Scelta non valida! Ordine ignorato.");
                    i--;
            }
        }

        int totaleCotone = quantitaCotone * PREZZO_COTONE;
        int totalePelle = quantitaPelle * PREZZO_PELLE;
        int totaleNeoprene = quantitaNeoprene * PREZZO_NEOPRENE;
        int spesaTotale = totaleCotone + totalePelle + totaleNeoprene;

        System.out.println("\n--- RIEPILOGO ORDINI ---");
        System.out.println("Guanti di cotone: " + quantitaCotone + " paia - €" + totaleCotone);
        System.out.println("Guanti di pelle: " + quantitaPelle + " paia - €" + totalePelle);
        System.out.println("Guanti di neoprene: " + quantitaNeoprene + " paia - €" + totaleNeoprene);
        System.out.println("TOTALE COMPLESSIVO: €" + spesaTotale);

    }
}