package es;

public class Es {

	public static void ricerca(int[] v) {
		inf = v[0];
		sup = v[v.length()-1];
		while(inf <= sup){
			medio = (double)(inf+sup)/2;
			if (v[medio] == num) {
				trovato = true;
				break;
			}else{
				if (v[medio] < num){
					inf = medio + 1;
				}else{
					sup = medio -1;
				}
			}
		}
		return (trovato);

	}

	public class BubbleSortConSentinella {

		public static void bubbleSort(int[] array) {
			int n = array.length;
			boolean scambiato;  // Sentinella per verificare la presenza di scambi

			do {
				scambiato = false;  // Ogni passaggio inizia assumendo che l'array sia ordinato

				for (int i = 0; i < n - 1; i++) {
					// Se due elementi adiacenti sono nell'ordine sbagliato, li scambiamo
					if (array[i] > array[i + 1]) {
						// Scambia gli elementi
						int temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;

						// Imposta scambiato a true, indicando che è avvenuto uno scambio
						scambiato = true;
					}
				}

				// Ad ogni iterazione possiamo considerare l'ultimo elemento già ordinato
				n--;

			} while (scambiato);  // Se non ci sono stati scambi, l'array è ordinato
		}


		static void ingenuo(String[] s) {
			for(int g=0; g<s.length-1; g++){
				for (int h=g+1; h<s.length; h++){
					String temp;
					temp = s[g];
					s[g] = s[h];
					s[h] = temp;
				}
			}

		}

}
