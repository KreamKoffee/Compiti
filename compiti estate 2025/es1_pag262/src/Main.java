import java.util.Scanner;

//Scrivi una funzione che ritorna vero (0) se due stringhe sono identiche oppure un numero che
//indica quanti caratteri consecutivi sono uguali.

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa:");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String str2 = scanner.nextLine();

        int risultato = compara(str1, str2);
    }

    public static int compara(String str1, String str2){
        if(str1.equals(str2)){
            return 0;
        }else{
            int count = 0;
            int minLength = Math.min(str1.length(), str2.length());
            for(int i = 0; i < minLength; i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }
    }
}
