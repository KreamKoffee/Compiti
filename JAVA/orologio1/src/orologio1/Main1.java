package orologio1;

public class Main1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		try {
			for (int u=0; u<10; u++) {
				Thread.sleep(1000);
				System.out.println("tempo effettivo: " + (System.currentTimeMillis()-start));
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
