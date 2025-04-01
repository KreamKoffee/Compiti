package punto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double x, y;

        Punto p1 = new Punto();

        System.out.print("Inserisci la x: ");
        x = in.nextDouble();
        System.out.print("Inserisci la y: ");
        y = in.nextDouble();

        Punto p2 = new Punto(x, y);

        double dx, dy;

        System.out.print("Inserisci quanto trasla x: ");
        dx = in.nextDouble();
        System.out.print("Inserisci quanto trasla y: ");
        dy = in.nextDouble();

        p1.trasla(dx, dy);

        p1.stampa();
        p2.stampa();

        if (p1.distanza() > p2.distanza()){
            System.out.println("p2 è più vicino all'origine");
        }else{
            System.out.println("p1 è più vicino all'origine");
        }
    }
}
