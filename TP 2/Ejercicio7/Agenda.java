package Ejercicio7;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private static Agenda _instancia = null;
    private Map<String, Contacto> contactos;

    private Agenda() {
        contactos = new HashMap<>();
    }

    public static Agenda getInstancia() {
        if (_instancia == null)
            _instancia = new Agenda();
        return _instancia;
    }

    public boolean agregarContacto(Contacto contacto) {
        if (contactos.containsKey(contacto.getNombre()))
            return false;
        contactos.put(contacto.getNombre(), contacto);
        return true;
    }

    public boolean eliminarContacto(String nombre) {
        return contactos.remove(nombre) != null;
    }

    public Contacto buscarContacto(String nombre) {
        return contactos.get(nombre);
    }

    public String toString() {
        String aux = new String();
        for (Contacto contacto : this.contactos.values())
            aux += contacto + "\n-----------------------------\n";
        return aux;
    }
}
