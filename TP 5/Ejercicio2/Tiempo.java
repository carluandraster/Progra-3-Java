/*
 * Esta clase contendrá un tiempo en minutos y segundos
 */
public class Tiempo {
    private int minutos;
    private int segundos;

    public Tiempo(int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
