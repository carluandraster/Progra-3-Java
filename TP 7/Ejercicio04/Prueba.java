package Ejercicio04;

import Ejercicio04.Modelo.Empresa;
import Ejercicio04.Modelo.Producto;
import Ejercicio04.Controlador.Controlador;
import Ejercicio04.Vista.Formulario;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = Empresa.get_instancia();
        empresa.agregarProducto(new Producto("Banana", 0, 10000));
        empresa.agregarProducto(new Producto("Manzana", 1, 15000));
        new Controlador(new Formulario("Ejercicio 4"));
    }
}
