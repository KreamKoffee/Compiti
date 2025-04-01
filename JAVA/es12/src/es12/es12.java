package es12;
import java.util.Scanner;
public class es12 {




        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double spesa;
            double sconto, sconto2, scontot;
            double tot;
            double secondi;

            System.out.print("inserisci la spesa: ");
            spesa = in.nextDouble();

            if (spesa >300)
            {
                secondi = spesa-300;

                sconto2 = secondi * 20 / 100;


                sconto = 300*10/100;
                spesa -= sconto;


            }else {
                secondi = 0;
                sconto = spesa*10/100;
                spesa -= sconto;
                sconto2 = 0;
            }
            scontot = sconto + sconto2;

            tot = spesa - sconto2;



            System.out.println("lo sconto vale: " +scontot);

            System.out.println("la spesa totale vale: " +tot);
        }


}
