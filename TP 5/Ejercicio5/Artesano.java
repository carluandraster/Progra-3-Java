public abstract class Artesano {
    protected String nombre;

    public Artesano(String nombre) {
        this.nombre = nombre;
    }

    public abstract String trabajar(Material mat);

    @Override
    public String toString() {
        return this.nombre;
    }
}
