package Ejercicio4.a;

public class ConjuntoNumeros implements Cloneable {
    private int[] celda;
    private int largo;
    private String nombre;

    public ConjuntoNumeros(String nombre, int largo) {
        this.largo = largo;
        this.nombre = nombre;
        this.celda = new int[largo];
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            ConjuntoNumeros aux = (ConjuntoNumeros) super.clone();
            aux.celda = (int[]) celda.clone();
            return aux;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }

    }

    public int[] getCelda() {
        return celda;
    }

    public int getLargo() {
        return largo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de conjunto: " + this.nombre + "\n");
        sb.append("Numeros: ");
        for (int i = 0; i < this.largo - 1; i++) {
            sb.append(celda[i] + ", ");
        }
        sb.append(celda[this.largo - 1]);
        return sb.toString();
    }
}
