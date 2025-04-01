package es;

import java.util.Scanner;

public class Es {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] arg){



        String[] nome = new String[5];
        String[] tel = new String[5];
        int scelta;
        boolean inserito = false;

        do{
            System.out.println("Inserisci il contatto");
            inserito = true;
            carica(nome, tel);
        }while(inserito);

        do{
            System.out.println("1. Inserisci contatto");
            System.out.println("2. Ordina");
            System.out.println("3. Stampa");
            System.out.println("4. Esci");

            scelta = in.nextInt();

            switch (scelta){
                case 1:
                    carica(nome, tel);
                    break;
                case 2:
                    ordina(nome, tel);
                    break;
                case 3:
                    stampa(nome, tel);
                    break;
                case 4:
                    break;

            }
        }while(scelta > 4 || scelta < 1);


    }

    static void carica (String[] nome, String[] tel){

            int index = 0;

            if (index < 5){
                System.out.println("inserisci il nome: ");
                nome[index] = in.next();
                System.out.println("Inserisci il telefono");
                index ++;
            }else{
                System.out.println("non c'è più spazio! ");
            }


    }

    static void ordina (String[] nome, String[] tel){
        String temp;
        boolean swapped;

        for(int g=0; g< nome.length-1; g++){
            swapped = false;
            for (int y=0; y<nome.length-g; y++){
                if (nome[y].compareTo(nome[y+1] ) > 0){
                    temp = nome[y];
                    nome[y] = nome[y+1];
                    nome[y+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    static void stampa(String[] nome, String[] tel){
        for (int g=0; g< nome.length; g++){
            System.out.print(nome[g] + "    " + tel[g]);
        }
    }
}
