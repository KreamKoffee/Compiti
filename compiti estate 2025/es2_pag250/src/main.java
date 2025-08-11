import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Inserisci un numero positivo inferiore a 10000: ");
            num = scanner.nextInt();
        } while (num <= 0 || num >= 10000);

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] divisori = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisori[idx++] = i;
            }
        }
        System.out.print("Divisori di " + num + ": ");
        for (int d : divisori) {
            System.out.print(d + " ");
        }
    }
}