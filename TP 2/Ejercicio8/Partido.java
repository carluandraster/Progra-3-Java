package Ejercicio8;

import java.sql.Date;
import java.util.Vector;

public class Partido {
    private Vector<Equipo> equipos;
    private Date fecha;

    public Partido(Date fecha) {
        this.fecha = fecha;
    }

    public Vector<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Vector<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
