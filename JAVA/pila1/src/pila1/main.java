package pila1;
public class main {
	public static void main(String[] args) {
		pila p=new pila(5);
		p.push("Andrea");
		p.push("Nicolò");
		p.push("Maria");
		p.pop();
		p.pop();
		p.push("Giovanni");
		while(p.isEmpty()==false) {
			System.out.println(p.pop());
		}
	}
}
