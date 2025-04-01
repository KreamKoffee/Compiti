public class Es {
    public static void main(String[] args){
        int dimensione = 20;
        int[] TANTI = new int[dimensione];

        int seed = 12345;
        for (int i = 0; i < dimensione; i++) {
            seed = (seed * 32719 + 3) % 32749;
            TANTI[i] = (seed % 41) - 20;
        }

        int contaNegativi = 0, contaPositivi = 0;
        for (int num : TANTI) {
            if (num < 0) contaNegativi++;
            else contaPositivi++;
        }


        int[] NEGATIVI = new int[contaNegativi];
        int[] POSITIVI = new int[contaPositivi];


        int indiceNegativi = 0, indicePositivi = 0;
        for (int num : TANTI) {
            if (num < 0) {
                NEGATIVI[indiceNegativi++] = num;
            } else {
                POSITIVI[indicePositivi++] = num;
            }
        }


        bubbleSort(NEGATIVI);
        bubbleSort(POSITIVI);


        System.out.println("Array originale TANTI:");
        for (int num : TANTI) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVettore NEGATIVI ordinato:");
        for (int num : NEGATIVI) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVettore POSITIVI ordinato:");
        for (int num : POSITIVI) {
            System.out.print(num + " ");
        }
    }


    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
