import Ejercicio6.*;

public class Prueba {
    public static void main(String[] args) {
        Club club1 = new Club();
        Socio socio1 = new Socio();
        club1.setNombre("River Plate");
        socio1.setNombre("Carlos Andres Efstratiadis");
        socio1.setEdad(70);
        System.out.println(club1.calcularCuota(socio1));
    }
}
