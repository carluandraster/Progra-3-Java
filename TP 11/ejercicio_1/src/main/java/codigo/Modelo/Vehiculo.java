package codigo.Modelo;

import java.io.Serializable;

public class Vehiculo implements Serializable {
    private String N_Chasis;
    private int anio_fabricacion;

    public Vehiculo() {
        super();
    }

    public Vehiculo(String n_Chasis, int anio_fabricacion) {
        N_Chasis = n_Chasis;
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getN_Chasis() {
        return N_Chasis;
    }

    public void setN_Chasis(String n_Chasis) {
        N_Chasis = n_Chasis;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

}
