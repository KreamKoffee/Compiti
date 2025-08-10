// src/Main.java
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static int generaNumero() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public static boolean indovinaNumero(int num, int tentativi) {
        while (tentativi > 0) {
            System.out.print("Inserisci un numero di 4 cifre: ");
            int tentativo = scanner.nextInt();
            if (tentativo == num) {
                System.out.println("Hai indovinato il numero!");
                return true;
            } else if (tentativo > num) {
                System.out.println("Troppo grande.");
            } else {
                System.out.println("Troppo piccolo.");
            }
            tentativi--;
            System.out.println("Tentativi rimasti: " + tentativi);
        }
        System.out.println("Hai esaurito i tentativi. Il numero era: " + num);
        return false;
    }

    public static void main(String[] args) {
        final int MAX_TENTATIVI = 4;
        boolean continua = true;
        while (continua) {
            int numeroSegreto = generaNumero();
            boolean indovinato = indovinaNumero(numeroSegreto, MAX_TENTATIVI);
            System.out.print("Vuoi giocare ancora? (s/n): ");
            String risposta = scanner.next();
            continua = risposta.equalsIgnoreCase("s");
        }
        System.out.println("Grazie per aver giocato!");
    }
}