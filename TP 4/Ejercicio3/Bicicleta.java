public class Bicicleta extends Vehiculo {
    public int a = 30;

    public void detalle() {
        System.out.print("Bicicleta");
    }

    @Override
    public int getA() {
        return a;
    }
}
