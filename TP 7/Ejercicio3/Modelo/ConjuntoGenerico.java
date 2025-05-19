package Ejercicio3.Modelo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ConjuntoGenerico<T> implements IConjunto<T> {
    private LinkedHashSet<T> elementos;

    public ConjuntoGenerico() {
        this.elementos = new LinkedHashSet<>();
    }

    @Override
    public void agrega(T elemento) throws OperacionConjuntoInvalidaException {
        boolean aux = this.elementos.add(elemento);
        if (!aux) {
            throw new OperacionConjuntoInvalidaException("Se quiso agregar un elemento que ya existía", elemento);
        }
    }

    @Override
    public void elimina(T elemento) throws OperacionConjuntoInvalidaException {
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
    public Iterator<T> getIterator() {
        return this.elementos.iterator();
    }

}
