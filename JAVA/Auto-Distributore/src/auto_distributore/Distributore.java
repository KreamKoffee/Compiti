package auto_distributore;

public class Distributore {

private String citta;

    private String proprietario;

    private int capCisterna;

    private int carburantePresente;

    private double costoPerLitro;

    public Distributore(String citta, String proprietario, int capCisterna, int carburantePresente, double costoPerLitro) {

        this.citta = citta;

        this.proprietario = proprietario;

        this.capCisterna = capCisterna;

        this.carburantePresente = carburantePresente;

        this.costoPerLitro = costoPerLitro;

    }

    public void effettuaRifornimento(Auto auto, int importo) {

        int litriRiforniti = (int) (importo / costoPerLitro);

        if (litriRiforniti > carburantePresente) {

            System.out.println("Carburante insufficiente nella cisterna.");

        } else {

            carburantePresente -= litriRiforniti;

            auto.riempi(litriRiforniti);

            System.out.println("Rifornimento effettuato: " + litriRiforniti + " litri.");

        }

    }

    public void riempiCisterna() {

        carburantePresente = capCisterna;

        System.out.println("La cisterna è stata riempita completamente.");

    }

    public void stampaDati() {

        System.out.println("\n--- Dati del Distributore ---");

        System.out.println("Città: " + citta);

        System.out.println("Proprietario: " + proprietario);

        System.out.println("Capacità cisterna: " + capCisterna + " litri");

        System.out.println("Carburante presente: " + carburantePresente + " litri");

        System.out.println("Costo al litro: " + costoPerLitro + " €");

    }
    
}
