import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la quantità di numeri da creare:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = (int)(Math.random() * 100);
        }

        for(int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(numbers[i]);
        }
    }
}