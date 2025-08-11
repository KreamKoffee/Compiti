import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la quantità di numeri: ");
        int n = scanner.nextInt();
        int[] numeri = new int[n];
        for(int i=0; i<n; i++){
            int num = (int)(Math.random()*100);
            num = num*num;
            System.out.print(num);
            System.out.print("\t");
        }
    }
}