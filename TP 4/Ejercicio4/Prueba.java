import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        VehiculoFactory factory = VehiculoFactory.getInstancia();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(factory.getVehiculo("AUTO", "AA123AB", 4));
        vehiculos.add(factory.getVehiculo("CAMION", "AA123AC"));
        vehiculos.add(factory.getVehiculo("COMBI", "AA123AD", 10));
        vehiculos.add(factory.getVehiculo("CAMIONETA DE CARGA", "AA123AE", 12.5));
        vehiculos.add(factory.getVehiculo("CAMION", "AA123AF"));
        vehiculos.add(factory.getVehiculo("AUTO", "AA123AG", 5));
        vehiculos.add(factory.getVehiculo("AUTO", "AB123AB", 3));
        vehiculos.add(factory.getVehiculo("CAMION", "AB123AC"));
        vehiculos.add(factory.getVehiculo("COMBI", "AB123AD", 15));
        vehiculos.add(factory.getVehiculo("CAMIONETA DE CARGA", "AB123AE", 17.0));
        System.out.println(vehiculos);
    }
}
