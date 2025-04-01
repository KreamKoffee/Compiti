package stampante;

public class Stampante {
	private String marca;
	private String tipo;
	private int[] cartucce ={100, 100, 100, 100};
	
	public Stampante(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}
	
	public boolean stampa(int ut_c, int ut_m, int ut_y, int ut_k, int pagine) {
		ut_c *= pagine;
		ut_m *= pagine;
		ut_y *= pagine;
		ut_k *= pagine;
		if(cartucce[0]<20 && cartucce[1]<20 && cartucce[2]<20 && cartucce[3]<20) {
			if(cartucce[0]>ut_c && cartucce[1]>ut_m && cartucce[2]>ut_y && cartucce[0]>ut_k) {
				cartucce[0]-=ut_c;
				cartucce[1]-=ut_m;
				cartucce[2]-=ut_y;
				cartucce[3]-=ut_k;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	public boolean stampa(int ut_c, int ut_m, int ut_y, int ut_k) {
		if(cartucce[0]<20 && cartucce[1]<20 && cartucce[2]<20 && cartucce[3]<20) {
			if(cartucce[0]>ut_c && cartucce[1]>ut_m && cartucce[2]>ut_y && cartucce[0]>ut_k) {
				cartucce[0]-=ut_c;
				cartucce[1]-=ut_m;
				cartucce[2]-=ut_y;
				cartucce[3]-=ut_k;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public void ricarica(char cartuccia) {
		switch(cartuccia) {
		case 'c':
			cartucce[0] = 100;
			break;
			
		case 'm':
			cartucce[1] = 100;
			break;
			
		case 'y':
			cartucce[2] = 100;
			break;
			
		case 'k':
			cartucce[3] = 100;
			break;
		}
	}
	
	public int[] getCartuccia() {
		return(cartucce);
	}
	
	public String getMarca() {
		return(marca);
	}
	
	public String getTipo() {
		return(tipo);
	}
}
