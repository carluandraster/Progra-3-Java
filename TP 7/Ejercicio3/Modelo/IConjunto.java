package Ejercicio3.Modelo;

import java.util.Iterator;

public interface IConjunto<T> {
    public void agrega(T elemento) throws OperacionConjuntoInvalidaException;

    public void elimina(T elemento) throws OperacionConjuntoInvalidaException;

    public int getCardinal();

    public Iterator<T> getIterator();
}
