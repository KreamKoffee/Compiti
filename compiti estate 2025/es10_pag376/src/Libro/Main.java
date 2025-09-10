package Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1234567890", "Il Grande Gatsby", "F. Scott Fitzgerald");
        System.out.println(libro1.to_String());


        if (libro1.prendi_in_presto()) {
            System.out.println("Hai preso in prestito il libro.");
        } else {
            System.out.println("Il libro è già in prestito.");
        }
        System.out.println(libro1.to_String());

        if (!libro1.restituisci()) {
            System.out.println("Hai restituito il libro.");
        } else {
            System.out.println("Il libro non era in prestito.");
        }
        System.out.println(libro1.to_String());
    }
}
