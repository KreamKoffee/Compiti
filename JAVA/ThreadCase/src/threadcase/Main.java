package threadcase;

public class Main {
    public static void main(String[] args){
        ThreadCase c1 = new ThreadCase("via aldo moro", 300000, 300, 200, 3);
        c1.start();
    }
}
