package ListaDiStudenti;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;

    Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return matricola + ": " + nome + " " + cognome;
    }
}
