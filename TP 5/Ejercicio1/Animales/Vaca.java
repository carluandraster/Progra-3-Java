public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre, 20);
    }

    @Override
    public void emiteSonido() {
        System.out.println("Muu");
    }

    @Override
    public String toString() {
        return super.toString() + "muu";
    }
}
