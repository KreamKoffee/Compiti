package Rettangolo;

public class main {
    public static void main(String[] args){
        Rettangolo r1 = new Rettangolo(10, 18);
        Rettangolo r2 = new Rettangolo(10, 20);

        r1.perimetro();
        r1.area();

        System.out.println("Rettangolo 2");

        r2.perimetro();
        r2.area();
    }
}
