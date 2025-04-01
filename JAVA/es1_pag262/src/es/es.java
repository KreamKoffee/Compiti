package es;

public class es {
    public static void main(String[] args){

    }

    static int funz(String s1 ,String s2){
        if (s1.equals(s2)) {
            return 0;
        }


        int count = 0;
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
