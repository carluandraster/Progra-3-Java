package Ejercicio3.Modelo;

import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoGenericoOrdenado<E extends Comparable<E>> implements IConjunto<E> {
    private TreeSet<E> elementos;

    public ConjuntoGenericoOrdenado() {
        this.elementos = new TreeSet<>();
    }

    @Override
    public void agrega(E elemento) throws OperacionConjuntoInvalidaException {
        boolean aux = this.elementos.add(elemento);
        if (!aux) {
            throw new OperacionConjuntoInvalidaException("Se quiso agregar un elemento que ya existía", elemento);
        }
    }

    @Override
    public void elimina(E elemento) throws OperacionConjuntoInvalidaException {
        boolean aux = this.elementos.remove(elemento);
        if (!aux) {
            throw new OperacionConjuntoInvalidaException("Se quiso remover un elemento que no existía", elemento);
        }
    }

    @Override
    public int getCardinal() {
        return this.elementos.size();
    }

    @Override
    public Iterator<E> getIterator() {
        return this.elementos.iterator();
    }

    public E getMayor() {
        return this.elementos.last();
    }

    public E getMenor() {
        return this.elementos.first();
    }
}
