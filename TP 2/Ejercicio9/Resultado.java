package Ejercicio9;

public class Resultado extends Encuentro {
    private int golesEquipo1;
    private int golesEquipo2;

    private Resultado(Encuentro encuentro, int golesEquipo1, int golesEquipo2) {
        super(encuentro.fecha);
        this.equipo1 = encuentro.equipo1;
        this.equipo2 = encuentro.equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public Resultado instanciar(Encuentro encuentro, int golesEquipo1, int golesEquipo2) {
        if (encuentro.validarEncuentro())
            return new Resultado(encuentro, golesEquipo1, golesEquipo2);
        else
            return null;
    }

    public int getGolesEquipo(int equipo) {
        if (equipo == 1)
            return golesEquipo1;
        else if (equipo == 2)
            return golesEquipo2;
        else
            return -1;
    }
}
