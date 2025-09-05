package negozio;

public class Negozio {
    private String proprietario;
    private String nomeNegozio;

    Negozio(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    String getProprietario() {
        return proprietario;
    }

    String getNomeNegozio(){
        return nomeNegozio;
    }


}
