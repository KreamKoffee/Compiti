package es;

import java.util.Scanner;

public class Es {
        public static Scanner in=new Scanner(System.in);

        public static void main(String[] args) {

            String[] s=new String[5];
            int scelta;

            do {
                System.out.println("1. Carica");
                System.out.println("2. Stampa");
                System.out.println("3. Ordina (ingenuo)");
                System.out.println("4. Ordina (bubble sort)");
                System.out.println("5. Fine");
                scelta = in.nextInt();

                switch(scelta) {
                    case 1:

                        carica(s);
                        break;

                    case 2:
                        stampa(s);
                        break;

                    case 3:
                        ingenuo(s);

                    case 4:
                        bubble(s);

                    case 5:
                        break;
                }

            }while (scelta > 5 || scelta < 1);





        }

        static void carica(String[] s) {
            for(int i=0;i<s.length;i++) {
                System.out.print("Inserisci il nome corrente ");
                s[i]=in.nextLine();
            }
        }

        static void stampa(String[] s) {
            for (int g=0; g<s.length; g++) {
                System.out.print(s[g]+" ");
            }
        }

        static void bubble(String[] s) {
            //for (int f=0; f < s.length-1; f++) {
              //  for (int y=0; y<s.length; y++) {
              //     if (s[f].compareTo(s[f+1]) > 0) {
               //         String temp;
                //        temp = s[f];
               //         s[f] = s[f+1];
                //        s[f+1] = temp;
             //       }
             //   }
          //  }
        	
        	String temp;
        	boolean scambi;
        	do {
        		scambi = false;
        		for (int u=0; u<s.length-1; u++) {
        			if (s[u].compareTo(s[u+1]) > 0) {
        		            temp = s[u];
        		            s[u] = s[u+1];
        					s[u+1] = temp;
        					scambi = true;
        			
        		}
        	}
        	
        	
        }while(scambi);
       }

        static void ingenuo(String[] s) {
            for(int g=0; g<s.length-1; g++){
                for (int h=g+1; h<s.length; h++){
                    String temp;
                    temp = s[g];
                    s[g] = s[h];
                    s[h] = temp;
                }
        }

    }
}

