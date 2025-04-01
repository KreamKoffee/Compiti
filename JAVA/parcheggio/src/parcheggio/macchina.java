package parcheggio;
import java.util.concurrent.Semaphore;

public class Macchina implements Runnable{
		public Semaphore parcheggio;
		public String nome;
}
public Macchina(Semaphore parcheggio,String nome) {
		this.parcheggio= parcheggio;
		this.nome=nome;
}


}
