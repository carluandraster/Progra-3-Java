package Ejercicio5.Factories;

import Ejercicio5.Choferes.Domicilio;

public class DomicilioFactory {
    private static DomicilioFactory _instancia = null;

    private DomicilioFactory() {
    }

    public static DomicilioFactory getInstancia() {
        if (_instancia == null)
            _instancia = new DomicilioFactory();
        return _instancia;
    }

    public Domicilio generarDomicilio(String calle, int altura) {
        return new Domicilio(calle, altura);
    }
}
