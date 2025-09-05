import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        int n = scanner.nextInt();
        int[] numeri = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        System.out.println("Elementi duplicati:");
        boolean trovatoDuplicato = false;
        for (int i = 0; i < n; i++) {
            boolean duplicato = false;
            for (int j = i + 1; j < n; j++) {
                if (numeri[i] == numeri[j]) {
                    duplicato = true;
                    break;
                }
            }
            // Stampa solo la prima occorrenza del duplicato
            if (duplicato) {
                boolean giaStampato = false;
                for (int k = 0; k < i; k++) {
                    if (numeri[k] == numeri[i]) {
                        giaStampato = true;
                        break;
                    }
                }
                if (!giaStampato) {
                    System.out.println(numeri[i]);
                    trovatoDuplicato = true;
                }
            }
        }
        if (!trovatoDuplicato) {
            System.out.println("Nessun duplicato trovato.");
        }
    }
}

