package ContoCorrente;

public class ContoCorrente {
    String codice;
    double saldo = 0;
    String intestatario;

    public ContoCorrente(String intestatario, String codice ){
        this.intestatario = intestatario;
        this.codice = codice;
    }

    boolean versamento(double importo){
        saldo += importo;
        System.out.println("nuovo saldo: " +saldo);
        return true;
    }

    boolean prelievo(double importo){
        if (this.saldo < importo){
            System.out.println("saldo insifficente" +saldo);
            return false;
        }else{
            this.saldo-=importo;
            System.out.println("nuovo saldo: " +saldo);
            return true;
        }
    }
}
