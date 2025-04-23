package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Surtidor s = new Surtidor();
        try {
            s.cargarCombustible("super", -500);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
