package Ejercicio5;

import java.util.ArrayList;
import Ejercicio5.Choferes.*;
import Ejercicio5.Vehiculos.*;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstancia();
        ArrayList<Categoria> categorias;
        ArrayList<Chofer> choferes;
        ArrayList<Vehiculo> vehiculos;

        // Categorias
        empresa.agregarCategoria("Categoria 1", 10000, true, false, false);
        empresa.agregarCategoria("Categoria 2", 15000, true, true, false);
        empresa.agregarCategoria("Categoria 3", 15000, false, false, true);
        empresa.agregarCategoria("Categoria 4", 17000, true, true, true);
        categorias = empresa.getCategorias();

        // Colectivos
        empresa.agregarVehiculo("2016");
        empresa.agregarVehiculo("2020");
        empresa.agregarVehiculo("Mercedes Benz 1114", 15, 10);
        vehiculos = empresa.getVehiculos();

        // Choferes
        choferes = empresa.getPersonal();
        empresa.agregarChofer("Andres", categorias.get(2), "Av Callao", 934);
        choferes.get(0).setVehiculo(vehiculos.get(0));
        empresa.agregarChofer("Carlos", categorias.get(1), "Avellaneda", 123);
        choferes.get(1).setVehiculo(empresa.getVehiculos().get(1));
        empresa.agregarChofer("Pedro", categorias.get(0), "Av De Las Camelias", 1345);

        for (Chofer chofer : choferes) {
            System.out.println(chofer);
        }
    }
}
