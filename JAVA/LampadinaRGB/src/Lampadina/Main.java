package Lampadina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LampadinaRGB l1 = new LampadinaRGB(100, false, 0, 0, 0, 0);
        int menu;
        int p;
        int v, b, r;
        do {
            System.out.println("1-Accendi la lampadina");
            System.out.println("2-Spegni la lampadina");
            System.out.println("3-Regola la potenza");
            System.out.println("4-Regola il colore");
            System.out.println("5-Visualizza i dati della lampadina");
            System.out.println("6-Fine");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    l1.accendi();
                    break;
                case 2:
                    l1.spegni();
                    break;
                case 3:
                    if (l1.getStato()) {
                        do {
                            System.out.println("Inserisci quanto deve essere potente: ");
                            p = in.nextInt();
                        } while (p < 1 || p > 10);
                        l1.regola(p);
                    } else
                        System.out.println("Lampadina spenta");
                    break;
                case 4:
                    if (l1.getStato()) {
                        do {
                            System.out.println("Colore verde: ");
                            v = in.nextInt();
                        } while (v < 1 || v > 10);
                        do {
                            System.out.println("Colore blu: ");
                            b = in.nextInt();
                        } while (b < 1 || b > 10);
                        do {
                            System.out.println("Colore rosso: ");
                            r = in.nextInt();
                        } while (r < 1 || r > 10);
                        l1.regolaColore(v, b, r);
                    } else
                        System.out.println("Lampadina spenta");
                    break;
                case 5:
                    l1.stampa();
            }
        } while (menu != 6);

    }
}