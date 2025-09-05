package es;

import java.util.Scanner;

public class es {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s ;
        int vocale;
        System.out.println("Inserisci una stringa: ");
        s = in.nextLine();

        vocale = funzione(s);
        if (vocale == 0){
            System.out.println("la stringa contiene almeno una vocale maiuscola");
        }else{
            System.out.println("la stringa non contiene nessuna vocale maiuscola");
        }
    }

    static int funzione(String s){
        for(int g=0; g<s.length(); g++)
        {
            char let = s.charAt(g);

            switch(let){
                case 'A':
                case 'O':
                case 'E':
                case 'I':
                case 'U':
                    return(0);
            }
        }

        return(1);
    }
}
