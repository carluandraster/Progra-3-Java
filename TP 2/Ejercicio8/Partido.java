package Ejercicio8;

import java.sql.Date;

public class Partido {
    protected Equipo[] equipos = new Equipo[2];
    protected Date fecha;

    public Partido(Date fecha) {
        this.fecha = fecha;
    }

    public Partido(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public Partido(Equipo[] equipos, Date fecha) {
        this.equipos = equipos;
        this.fecha = fecha;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
