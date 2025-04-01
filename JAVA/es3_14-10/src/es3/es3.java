package es3;
import java.util.Random;

public class es3 {
    public static void main(String[] args) {

        Random random = new Random();
        int n;
        int prima = -1;

        while(true){
            n = random.nextInt(10) + 1;
            System.out.println("Numero generato:"+ n);

            if (n == prima){
                System.out.println("due numeri consecutivi uguali");
                break;
            }

            prima = n;
        }



    }
}
