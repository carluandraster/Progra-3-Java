package Ejercicio5.Factories;

import Ejercicio5.Vehiculos.*;

public class VehiculoFactory {
    private static VehiculoFactory _instancia = null;

    private VehiculoFactory() {
    }

    public static VehiculoFactory getInstancia() {
        if (_instancia == null)
            _instancia = new VehiculoFactory();
        return _instancia;
    }

    /*
     * Precondición: modelo no puede ser null ni string vacío
     * Postcondición: crea un ColectivoDeLinea distinto de null
     */
    public ColectivoDeLinea crearVehiculo(String modelo, int nroInterno) {
        ColectivoDeLinea aux;
        aux = new ColectivoDeLinea(modelo);
        aux.setNumerointerno(nroInterno);
        return aux;
    }

    public ColectivoDeLargaDistancia crearVehiculo(String modelo, boolean cochecama, int nroInterno) {
        ColectivoDeLargaDistancia aux = new ColectivoDeLargaDistancia(modelo, cochecama);
        aux.setNumerointerno(nroInterno);
        return aux;
    }

    public Camion crearVehiculo(String modelo, int tara, int cargaMaxima, int nroInterno) {
        Camion aux = new Camion(modelo, tara, cargaMaxima);
        aux.setNumerointerno(nroInterno);
        return aux;
    }
}
