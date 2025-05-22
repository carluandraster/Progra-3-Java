package Ejercicio2;

import Ejercicio2.Controladores.ControladorB;
import Ejercicio2.Vista.IncisoB.*;

public class Main2 {
    public static final int MAX_ELEM = 100;
    public static void main(String[] args) {
        String arg0 = "Ejercicio2b";
        new ControladorB(new MenuPrincipal(arg0),
                new Inscripcion(arg0),
                new LlamadoMasUrgente(arg0),
                new CrearLlamado(arg0),
                new Estadisticas(arg0));
    }
}
