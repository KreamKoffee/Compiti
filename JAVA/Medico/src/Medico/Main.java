package Medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Paziente paziente = new Paziente("aldo", "moro", "aldo moro 21", "3337654442", "deez nuts", true);

        Medico m1 = new Medico("mario", "rossi", "via Garibaldi 5", "035656789");

        m1.inserisci(paziente);
        m1.stampa();
        m1.ricerca(paziente);


    }
}
