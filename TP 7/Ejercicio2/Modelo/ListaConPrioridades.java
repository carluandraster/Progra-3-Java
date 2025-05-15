package Ejercicio2.Modelo;

import java.util.PriorityQueue;

public class ListaConPrioridades<T extends Comparable> {
    protected PriorityQueue<T> elementos;

    public ListaConPrioridades() {
        this.elementos = new PriorityQueue<>();
    }

    public void agrega(T elemento){
        this.elementos.add(elemento);
    }

    public T consultaElemento(){
        return this.elementos.peek();
    }

    public int getCantidad(){
        return this.elementos.size();
    }

    public T getElemento(){
        return this.elementos.poll();
    }
}
