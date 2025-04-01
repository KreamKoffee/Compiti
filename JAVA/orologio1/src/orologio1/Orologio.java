package orologio1;

public class Orologio {
    private int ore;
    private int min;
    private int sec;

    Orologio(int ore, int min, int sec){
        this.ore = ore;
        this.min = min;
        this.sec = sec;
    }

    Orologio(){
        this.ore = 0;
        this.min = 0;
        this.sec = 0;
    }

    void aggiorna() {
        while (true) {
            sec++;
            if (sec == 60) {
                sec = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    ore++;
                    if (ore == 24) {
                        ore = 0;
                    }
                }
            }
        }
    }

    void stampa(){
        System.out.println("Ore: " + ore + " Minuti: " + min + " Secondi: " + sec);
    }

}
