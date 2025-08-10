import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero intero (n): ");
        int n = scanner.nextInt();
        System.out.print("Inserisci il secondo numero intero (m): ");
        int m = scanner.nextInt();

        int risultato = moltiplica(n, m);
        System.out.println("Il risultato della moltiplicazione è: " + risultato);
    }

    // Moltiplicazione russa
    public static int moltiplica(int n, int m) {
        int risultato = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                risultato = risultato + m;
            }
            n = n / 2;
            m = m * 2;
        }
        return risultato;
    }
}