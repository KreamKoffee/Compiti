package auto_distributore;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

       Distributore distributore = new Distributore("Bergamo", "Sandro", 10000, 5000, 2.0);

       Auto auto = new Auto("NF708KJ", "Audi A6", 80, 50);

       int scelta;

       do {

           System.out.println("\n--- Menu ---");

           System.out.println("1 - Effettua rifornimento");

           System.out.println("2 - Effettua viaggio");

           System.out.println("3 - Riempi cisterna");

           System.out.println("4 - Stampa dati auto");

           System.out.println("5 - Stampa dati distributore");

           System.out.println("6 - Fine");

           System.out.print("Scegli un'opzione: ");

           scelta = in.nextInt();

           switch (scelta) {

               case 1:

                   System.out.print("Inserisci l'importo per il rifornimento (€): ");

                   int importo = in.nextInt();

                   distributore.effettuaRifornimento(auto, importo);

                   break;

               case 2:

                System.out.print("Inserisci la lunghezza del viaggio (km): ");

                   int km = in.nextInt();

                   auto.viaggia(km);

                   break;

               case 3:

                   distributore.riempiCisterna();

                   break;

               case 4:

                   auto.stampa();

                   break;

               case 5:

                   distributore.stampaDati();

                   break;

               case 6:

                   System.out.println("Programma terminato.");

                   break;

               default:

                   System.out.println("Opzione non valida, riprova.");

           }

       } while (scelta != 6);

}

}
