public class Pollito extends Animal {
    public Pollito(String nombre) {
        super(nombre, 10);
    }

    @Override
    public void emiteSonido() {
        System.out.println("Kikirikiii");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "kikirikiii\n";
    }
}
