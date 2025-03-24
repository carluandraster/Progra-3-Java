package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private String nombre;
    private String telefonoFijo;
    private List<String> telefonosCelulares;

    public Contacto(String nombre, String celular) {
        this.nombre = nombre;
        this.telefonoFijo = "";
        this.telefonosCelulares = new ArrayList<>(List.of(celular));
    }

    public Contacto(String nombre, String telefonoFijo, String celular) {
        this(nombre, celular);
        this.telefonoFijo = telefonoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public List<String> getTelefonosCelulares() {
        return telefonosCelulares;
    }

    public void setTelefonoCelular(String celular, int indice) {
        this.telefonosCelulares.set(indice, celular);
    }

    public void agregarCelular(String celular) {
        this.telefonosCelulares.add(celular);
    }

    public void eliminarCelular(String celular) {
        this.telefonosCelulares.remove(celular);
    }

    public String toString() {
        int N;
        String aux = "Nombre: " + this.nombre;
        if (this.telefonoFijo != "")
            aux += "\nTelefono fijo: " + this.telefonoFijo;
        N = this.telefonosCelulares.size();
        if (N > 0)
            if (N == 1) {
                aux += "\nTelefono celular: " + this.telefonosCelulares.get(0);
            } else {
                aux += "\nListado de telefonos celulares: ";
                for (String celular : this.telefonosCelulares) {
                    aux += "\n" + celular;
                }
            }
        return aux;
    }
}
