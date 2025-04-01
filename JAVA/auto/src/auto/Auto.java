package auto;

public class Auto {
	String marca;
	String colore;
	double cilindrata;
	int numMarce;
	int marcia;
	boolean accesa_spenta;
	
	Auto(String marca, String colore, double cilindrata, int numMarce){
		this.marca = marca;
		this.colore = colore;
		this.cilindrata = cilindrata;
		this.numMarce = numMarce;
		this.marcia = 0;
		this.accesa_spenta = false;
	}
	
	void accendi(){
		this.accesa_spenta = true;
	}
	
	void spegni() {
		this.accesa_spenta = false;
	}
	
	boolean cambia() {
		if (accesa_spenta == true && marcia < numMarce) {
			marcia ++;
			return true;
		}else {
			return false;
		}
	}
	
	boolean scala() {
		if (accesa_spenta == true && marcia > -1) {
			marcia --;
			return true;
		}else{
			return false;
		}
	}

}
