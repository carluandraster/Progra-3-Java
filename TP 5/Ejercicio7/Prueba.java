public class Prueba {
    public static void main(String[] args) {
        Mazo mazo = Mazo.getInstancia();
        mazo.agregarPersonaje("Mago");
        mazo.agregarPersonaje("Mago", "Tierra");
        mazo.agregarPersonaje("Hechicera", "Fuego");
        mazo.agregarPersonaje("Dragon", "Fuego");
        System.out.println(mazo);
    }
}
