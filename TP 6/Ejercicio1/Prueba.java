public class Prueba {
    public static void main(String[] args) {
        try {
            Usuario u1 = new Usuario("Andres", "contrasenia");
            Usuario u2 = new Usuario("Carlos", "abcdefg");
            Usuario u3 = new Usuario("Fernando", "nullefg");
            Usuario u4 = new Usuario("Maria", "1contra");
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
