public class Libro extends Publicacion implements Prestable {
    boolean prestado;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false;
    }

    @Override
    public void prestar() {
        if (prestado) {
            System.out.println("Error: el libro ya esta prestado");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            this.prestado = false;
        } else {
            System.out.println("Error: el libro no fue prestado");
        }
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        String aux;
        if (prestado) {
            aux = "El libro esta prestado\n";
        } else {
            aux = "El libro no esta prestado\n";
        }
        return super.toString() +
                aux;
    }
}
