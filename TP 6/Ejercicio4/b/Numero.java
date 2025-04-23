package Ejercicio4.b;

public class Numero {
    private int dato;

    public Numero(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dato);
        return sb.toString();
    }
}
