package Ejercicio2;

import Ejercicio2.Controladores.ControladorB;
import Ejercicio2.Vista.IncisoB.*;

public class Main2 {
    public static void main(String[] args) {
        final int MAX_ELEM = 100;
        String arg0 = "Ejercicio2b";
        new ControladorB(new MenuPrincipal(arg0),
                new Inscripcion(arg0),
                new LlamadoMasUrgente(arg0),
                new CrearLlamado(arg0, new Integer[MAX_ELEM]),
                new Estadisticas(arg0));
    }
}
