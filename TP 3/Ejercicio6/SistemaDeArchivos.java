package Ejercicio6;

public class SistemaDeArchivos extends Directorio {
    private static SistemaDeArchivos _instancia = null;

    private SistemaDeArchivos() {
        super("C:");
    }

    public static SistemaDeArchivos getInstancia() {
        if (_instancia == null)
            return new SistemaDeArchivos();
        return _instancia;
    }
}
