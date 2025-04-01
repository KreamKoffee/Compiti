package Medico;

public class Medico {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String tel;
    private Paziente[] pazienti = new Paziente[100];
    private int i=0;

    Medico(String nome, String cognome, String indirizzo, String tel){
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.tel = tel;
    }

    boolean inserisci(Paziente paziente){
        if (i<100){
            pazienti[i] = paziente;
            return true;
        }else{
            return false;
        }
    }

    void stampa(){
        for(int j=0; j<i; j++){
            pazienti[j].stampa();
        }
    }

    boolean ricerca(Paziente paziente){



        for(int j=0; j<i; j++){
            if(paziente == pazienti[j]){
                System.out.println("Telefono: " +pazienti[j].getNome());
                return true;
            }else{
                System.out.println("Nome non trovato");
                break;
            }
        }
        return false;
    }


}
