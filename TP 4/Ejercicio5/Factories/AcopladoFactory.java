package Ejercicio5.Factories;

import Ejercicio5.Vehiculos.Acoplado;

public class AcopladoFactory {
    private static AcopladoFactory _instancia = null;

    private AcopladoFactory() {
    }

    public static AcopladoFactory getInstancia() {
        if (_instancia == null)
            _instancia = new AcopladoFactory();
        return _instancia;
    }

    /*
     * Precondiciones: tara y cargaMaxima no pueden ser negativos
     * Postcondición: crea un acoplado distinto de null
     */
    public Acoplado generarAcoplado(int tara, int cargaMaxima, boolean refrigerado) {
        Acoplado aux = null;
        aux = new Acoplado(tara, cargaMaxima, refrigerado);
        return aux;
    }
}
