package CD;

public class Cd {
    private String codice;
    private String titolo;
    private String autore;
    private double costo;
    private int tracce;
    private int traccia_corrente;

    Cd(String codice, String titolo, String autore, int tracce){
        this.codice = codice;
        this.titolo = titolo;
        this.autore = autore;
        this.tracce = tracce;
    }

    int ascolta(int ascolta_traccia){

        if(ascolta_traccia > tracce || ascolta_traccia < 0){
            System.out.println("Tracia non esistente");
            return(0);
        }else{
            traccia_corrente = ascolta_traccia;
            return(1);
            }
    }

    String getCodice(){
        return codice;
    }

    String getTitolo(){
        return titolo;
    }

    String getAutore(){
        return autore;
    }

    int getTracce(){
       return tracce;
    }

    void dati(){
        System.out.println("Codice: " + codice);
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Numero Tracce: " + tracce);
    }



}
