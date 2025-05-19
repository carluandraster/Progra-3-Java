package Ejercicio3.Modelo;

public class OperacionConjuntoInvalidaException extends Exception {
    private Object elemento;

    public OperacionConjuntoInvalidaException(String message, Object elemento) {
        super(message);
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

}
