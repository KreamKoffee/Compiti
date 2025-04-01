package rettangolo;

public class main {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(14, 18);
		Rettangolo r2 = new Rettangolo(10, 10);
		r1.perimetro();
		r1.area();
		
		System.out.println("Il perimetro vale: " + r1.perimetro);
		System.out.println("L'area vale: " + r1.area);
		r2.perimetro();
		r2.area();
		System.out.println("Il perimetro vale: " + r2.perimetro);
		System.out.println("L'area vale: " + r2.area);

	}

}
