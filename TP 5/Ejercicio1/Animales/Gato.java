public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre, 20);
    }

    @Override
    public void emiteSonido() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return super.toString() + "miau\n";
    }
}
