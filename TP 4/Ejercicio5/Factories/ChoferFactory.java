package Ejercicio5.Factories;

import Ejercicio5.Choferes.*;

public class ChoferFactory {
    private static ChoferFactory _instancia = null;
    private DomicilioFactory generadorDeDomicilios;

    private ChoferFactory() {
        this.generadorDeDomicilios = DomicilioFactory.getInstancia();
    }

    public static ChoferFactory getInstancia() {
        if (_instancia == null)
            _instancia = new ChoferFactory();
        return _instancia;
    }

    public Chofer crearChofer(String nombre, String calle, int altura) {
        Chofer aux = new Chofer(nombre);
        aux.setDomicilio(this.generadorDeDomicilios.generarDomicilio(calle, altura));
        return aux;
    }

    public Chofer crearChofer(String nombre, Categoria categoria, String calle, int altura) {
        Chofer aux = this.crearChofer(nombre, calle, altura);
        aux.setCategoria(categoria);
        return aux;
    }
}
