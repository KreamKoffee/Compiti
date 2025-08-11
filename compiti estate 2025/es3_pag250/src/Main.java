public class Main {
    public static void main(String[] args){

        int max=0;
        int min=0;
        int pMax=0, pMin=0;

        int[] vet = new int[10];
        for (int i=0; i<10; i++){
            vet[i] = (int)(Math.random()*100);
        }

        for(int i=0; i<10; i++){
            if(max < vet[i]){
                max = vet[i];
                pMax = i;
            }

            if(min > vet[i] || i == 0){
                min = vet[i];
                pMin = i;
            }
        }

        vet[pMax] = min;
        vet[pMin] = max;
    }
}
