import java.util.ArrayList;
import java.util.HashMap;

public class Disco implements Prestable, Comparable<Disco> {
    private String codigo;
    private String titulo;
    private String interprete;
    private HashMap<String, Cancion> canciones;
    private boolean prestado;

    public Disco(String codigo, String titulo, String interprete) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.interprete = interprete;
        this.canciones = new HashMap<>();
        this.prestado = false;
    }

    public void agregarCancion(int numeroDePista, String titulo, int minutos, int segundos) {
        if (prestado) {
            System.out.println("No es posible modificar un disco prestado");
        } else
            this.canciones.put(titulo,
                    CancionFactory.getInstancia().crearCancion(numeroDePista, titulo, minutos, segundos));
    }

    public void eliminarCancion(String cancion) {
        if (prestado) {
            System.out.println("No es posible modificar un disco prestado");
        } else {
            this.canciones.remove(cancion);
        }
    }

    @Override
    public void prestar() {
        if (this.prestado) {
            System.out.println("El disco ya esta prestado");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
        } else {
            System.out.println("El disco no estaba prestado");
        }
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Cancion> getCanciones() {
        return (ArrayList<Cancion>) canciones.values();
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    @Override
    public int compareTo(Disco o) {
        int aux = this.interprete.compareTo(o.interprete);
        if (aux == 0) {
            aux = this.titulo.compareTo(o.titulo);
        }
        return aux;
    }
}
