package Ejercicio5;

public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;
    private Colectivo colectivo = null;

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    @Override
    public String toString() {
        if (this.colectivo == null) {
            return "Nombre: " + this.nombre + "\n" +
                    "Domicilio: " + this.domicilio + "\n" +
                    "Categoria: " + this.categoria.getNombrecategoria() + "\n" +
                    "Ningun colectivo asignado\n";
        } else
            return "Nombre: " + this.nombre + "\n" +
                    "Domicilio: " + this.domicilio + "\n" +
                    "Categoria: " + this.categoria.getNombrecategoria() + "\n" +
                    "Colectivo asignado numero " + this.colectivo.getNumerointerno() + "\n";
    }
}
