import Ejercicio5.Guerrero;

public class Main {
    public static void main(String[] args) {
        Guerrero Rambo = new Guerrero();
        Guerrero IvanDrago = new Guerrero();

        // Set Rambo
        Rambo.setNombre("Rocky Balboa");
        Rambo.setVitalidad(20);
        Rambo.setArmadura(5);
        Rambo.setX(0);
        Rambo.setY(0);

        // Set Ivan Drago
        IvanDrago.setNombre("Ivan Drago");
        IvanDrago.setVitalidad(20);
        IvanDrago.setArmadura(10);
        IvanDrago.setX(5);
        IvanDrago.setY(5);

        System.out.println(Rambo.getNombre());
    }
}