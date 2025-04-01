package es;
import java.util.Scanner;

public class es {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int scelta;
        String s;
        double perc;
        int pos;

        System.out.println("Inserisci la stringa: ");
        s = in.nextLine();


        do{
            System.out.println("1. Visualizzare la lunghezza");
            System.out.println("2. Visualizzare il primo carattere");
            System.out.println("3. Visualizzare l'ultimo carattere");
            System.out.println("4. Visualizzare la percentuale delle vocali");
            System.out.println("5. Visualizzare il carattere presente alla posizione scelta");
            System.out.println("0. Fine programma");

            scelta = in.nextInt();

            switch(scelta){
                case 1:
                    System.out.println(s.length());
                    break;

                case 2:
                    System.out.println(s.charAt(0));
                    break;

                case 3:
                    System.out.println(s.charAt(s.length()-1));
                    break;

                case 4:
                    perc = percVoc(s);
                    System.out.println(perc+"%");
                    break;

                case 5:
                    System.out.print("Inserisci la posizione: ");
                    pos = in.nextInt();
                    carattere(s, pos);

                case 0:
                    break;

            }


        }while(scelta != 0);
    }

    static double percVoc (String s){
        double percentuale;
        int vocale = 0;

        int tot = s.length();

        for( int h=0; h<tot; h++){
            switch (s.charAt(h)){
                case 'a':
                case 'A':
                    vocale+=1;
                    break;

                case 'o':
                case 'O':
                    vocale+=1;
                    break;

                case 'e':
                case 'E':
                    vocale+=1;
                    break;

                case 'i':
                case 'I':
                    vocale+=1;
                    break;

                case 'u':
                case 'U':
                    vocale+=1;
                    break;

            }
        }

        // 100 : x = tot : vocali

        percentuale = (double)(vocale *100) / tot;

        return(percentuale);
    }

    static void carattere (String s, int pos){

        System.out.println(s.charAt(pos));

    }
}
