package Ejercicio5.Vehiculos;

import Ejercicio5.Choferes.Chofer;

public class Camion extends Vehiculo {
    private int tara;
    private int cargaMaxima;
    private Acoplado acoplado;

    public Camion(String modelo, int tara, int cargaMaxima) {
        super(modelo);
        this.tara = tara;
        this.cargaMaxima = cargaMaxima;
    }

    public Acoplado getAcoplado() {
        return acoplado;
    }

    public void setAcoplado(Acoplado acoplado) {
        if (this.acoplado != null)
            this.acoplado.setEnUso(false);
        this.acoplado = acoplado;
        if (this.acoplado != null)
            this.acoplado.setEnUso(true);
    }

    public int getTara() {
        return tara;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().isHabilitaCamion();
    }

    @Override
    public String toString() {
        if (this.acoplado == null)
            return "Tipo de vehiculo: camion\n" +
                    super.toString() +
                    "Tara: " + this.tara + "\n" +
                    "Carga maxima: " + this.cargaMaxima + "\n" +
                    "No tiene acoplado\n";
        else
            return "Tipo de vehiculo: camion\n" +
                    super.toString() +
                    "Tara: " + this.tara + "\n" +
                    "Carga maxima: " + this.cargaMaxima + "\n" +
                    this.acoplado;
    }
}
