public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre, 13);
    }

    @Override
    public void emiteSonido() {
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return super.toString() + "guau\n";
    }
}
