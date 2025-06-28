import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di asterischi");
        int N = scanner.nextInt();
        int scelta ;
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Visualizza una riga di N asterischi");
            System.out.println("2. Visualizza una colonna di N asterischi");
            System.out.println("3. Visualizza una diagonale di N asterischi");
            System.out.println("4. Visualizza un quadrato di N asterischi");
            System.out.println("5. Visualizza una triangolo rettangolo di N asterischi");
            System.out.println("0. Fine");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();

            switch (scelta){
                case 1:
                    riga(N);
                    break;

                case 2:
                    colonna(N);
                    break;

                case 3:
                    diagonale(N);
                    break;

                case 4:
                    quadrato(N);
                    break;

                case 5:
                    triangolo(N);
                    break;

                case 0:
                    System.out.println("Programma Terminato");

                default:
                    System.out.println("Scelta non valida!");
            }
        }while(scelta !=0 );
    }

    public static void riga(int N){
        for(int i=0; i<N; i++){
            System.out.print("*");
        }
        System.out.println("*");
    }

    public static void colonna(int N){
        for(int i=0; i<N; i++){
            System.out.println("*");
        }
    }

    public static void diagonale(int N){
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

    public static void quadrato(int N){
        for(int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangolo(int N){
        for(int i=0; i<=N; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}