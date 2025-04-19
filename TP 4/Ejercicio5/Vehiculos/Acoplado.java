package Ejercicio5.Vehiculos;

public class Acoplado {
    private int tara;
    private int cargaMaxima;
    private boolean refrigerado;
    private int numeroAcoplado;
    private boolean enUso;

    public Acoplado(int tara, int cargaMaxima, boolean refrigerado) {
        this.tara = tara;
        this.cargaMaxima = cargaMaxima;
        this.refrigerado = refrigerado;
    }

    public int getTara() {
        return tara;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public int getNumeroAcoplado() {
        return numeroAcoplado;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setNumeroAcoplado(int numeroAcoplado) {
        this.numeroAcoplado = numeroAcoplado;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    private String booleanToString(boolean booleano) {
        if (booleano)
            return "SI";
        else
            return "NO";
    }

    @Override
    public String toString() {
        return "Tara: " + this.tara + "\n" +
                "Carga maxima: " + this.cargaMaxima + "\n" +
                "Refrigerado: " + this.booleanToString(this.refrigerado) + "\n" +
                "Numero de acoplado: " + this.numeroAcoplado + "\n" +
                "En uso: " + this.booleanToString(this.enUso);
    }
}
