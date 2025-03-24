package Ejercicio7;

public class Prueba {
    public static void main(String[] args) {
        Agenda agenda = Agenda.getInstancia();
        agenda.agregarContacto(new Contacto("Andres", "(223) 123-4567"));
        agenda.agregarContacto(new Contacto("Pedro", "(223) 891-0123"));
        agenda.buscarContacto("Pedro").agregarCelular("(223) 930-1600");
        agenda.agregarContacto(new Contacto("Carlos", "(223) 234-9876"));
        agenda.eliminarContacto("Carlos");
        System.out.println(agenda);
    }
}
