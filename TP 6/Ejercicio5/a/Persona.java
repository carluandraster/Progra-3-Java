package Ejercicio5.a;

public class Persona implements Cloneable, Comparable<Persona> {
    protected int DNI;
    protected String apellido;
    protected Domicilio domicilio;
    private int legajo;

    public Persona() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Persona aux;
        try {
            aux = (Persona) super.clone();
            aux.domicilio = (Domicilio) domicilio.clone();
            return aux;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public int getDNI() {
        return DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Apellido: " + this.apellido + "\n" +
                "DNI: " + this.DNI + "\n" +
                "Domicilio: " + this.domicilio + "\n" +
                "Numero de legajo: " + this.legajo;
    }

    @Override
    public int compareTo(Persona o) {
        int aux;
        aux = this.apellido.compareTo(o.apellido);
        if (aux == 0) {
            if (this.DNI > o.DNI) {
                aux = 1;
            } else {
                aux = -1;
            }
        }
        return aux;
    }
}
