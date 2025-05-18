package Ejercicio2.Modelo;

import java.util.HashMap;

public class Empresa {
    private static Empresa _instancia = null;
    private HashMap<Integer, Socio> socios;
    private OperadoraEmergencias opE;

    private Empresa() {
        super();
        this.socios = new HashMap<>();
        this.opE = new OperadoraEmergencias();
    }

    public static Empresa getInstancia() {
        if (_instancia == null) {
            _instancia = new Empresa();
        }
        return _instancia;
    }

    public HashMap<Integer, Socio> getSocios() {
        return socios;
    }

    public void agregarSocio(String nombre, int dni, String domicilio) {
        this.socios.put(dni, new Socio(dni, nombre, domicilio));
    }

    public OperadoraEmergencias getOpE() {
        return opE;
    }

}
