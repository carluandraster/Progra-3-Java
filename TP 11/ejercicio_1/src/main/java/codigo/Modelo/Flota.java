package codigo.Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Flota implements Serializable {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Flota() {
        this.vehiculos = new ArrayList<>();
    }

    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
