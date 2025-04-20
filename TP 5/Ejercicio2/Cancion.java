public class Cancion {
    private int numeroDePista;
    private String titulo;
    private Tiempo duracion;

    public Cancion(int numeroDePista, String titulo, Tiempo duracion) {
        this.numeroDePista = numeroDePista;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getNumeroDePista() {
        return numeroDePista;
    }

    public void setNumeroDePista(int numeroDePista) {
        this.numeroDePista = numeroDePista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tiempo getDuracion() {
        return duracion;
    }

    public void setDuracion(Tiempo duracion) {
        this.duracion = duracion;
    }

}
