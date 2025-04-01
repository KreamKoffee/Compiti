package cd;

public class Main {
    public static void main(String[] args) {
        CD cd1 = new CD(12345, "Favole", "Vasco Rossi", 12.54, 10);
        
        boolean successo = cd1.scegliTraccia(7);
        
        if (successo) {
            System.out.println("Numero traccia ascoltata: " + cd1.getTraccia());
        } else {
            System.out.println("Traccia non valida.");
        }
    }
}
