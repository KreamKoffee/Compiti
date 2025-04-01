package Medico;

public class Paziente {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String tel;
    private String tessera;
    private boolean ordinario;

    Paziente(String nome, String cognome, String indirizzo, String tel, String tessera, boolean ordinario){
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.tel = tel;
        this.tessera = tessera;
        this.ordinario = ordinario;
    }

    void stampa(){
        System.out.println("Nome: " +nome);
        System.out.println("Cognome: " +cognome);
        System.out.println("Indirizzo:" +indirizzo);
        System.out.println("tel: " +tel);
        if (ordinario)
        System.out.println("Ordinario");
        else
            System.out.println("Salutare");
    }

    String getTel(){
        return tel;
    }

    String getNome(){
        return nome;
    }
}
