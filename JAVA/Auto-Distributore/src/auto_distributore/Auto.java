package auto_distributore;

public class Auto {
	private String targa;
	private String modello;
	private double capSerbatoio;
	private double livello;
	private double consumoKM;
	
	Auto(String targa, String modello, double capSerbatoio, double consumoKM){
		this.targa = targa;
		this.modello = modello;
		this.capSerbatoio = capSerbatoio;
		this.consumoKM = consumoKM;
	}
	
	boolean riempi(double litri) {
			if ((livello + litri) > capSerbatoio) {
				return false;
			}else {
				livello += litri;
				return true;
			}
		}
	
	boolean viaggia(double km) {
		if((consumoKM*km) > livello) {
			return false;
		}else {
			livello -= consumoKM * km;
			return true;
		}
	}
	
	void stampa() {
		System.out.println("Targa: " +targa);
		System.out.println("Modello: " +modello);
		System.out.println("capSerbatoio: " +capSerbatoio);
		System.out.println("consumo in KM: " +consumoKM);
		System.out.println("Livello: " +livello);
		
	}

}
