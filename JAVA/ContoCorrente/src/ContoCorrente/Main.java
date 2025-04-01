package ContoCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String nome;
        String codice;
        double importo;

        System.out.print("insreisci il nome: ");
        nome = in.nextLine();
        System.out.print("inserisci il codice: ");
        codice = in.nextLine();

        ContoCorrente c1 = new ContoCorrente(nome, codice);

        System.out.print("Inserisci l'importo: ");
        importo = in.nextDouble();
        c1.versamento(importo);

        System.out.print("Inserisci l'importo: ");
        importo = in.nextDouble();
        c1.prelievo(importo);

    }
}
