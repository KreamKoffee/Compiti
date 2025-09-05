package negozio;

public class Main {
    public static void main(String[] args){
        Negozio negozio = new Negozio("Mario Rossi", "La Bottega di Mario");
        System.out.println("Proprietario: " + negozio.getProprietario());
        System.out.println("Nome Negozio: " + negozio.getNomeNegozio());
    }
}
