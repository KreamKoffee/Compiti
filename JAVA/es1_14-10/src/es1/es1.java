package es1;

public class es1 {
    public class void main(String[] args){
        int numero = 976;
        String binario = "";


        while (numero > 0) {

            int resto = numero % 2;

            binario = resto + binario;

            numero = numero / 2;
        }


        System.out.println("Il numero 976 in binario è: " + binario);
    }
    }

}
