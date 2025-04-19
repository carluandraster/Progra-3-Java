package Ejercicio5.Choferes;

public class Categoria {
    private String nombrecategoria;
    private double sueldo;
    private boolean habilitaColectivoLinea;
    private boolean habilitaColectivoLarga;
    private boolean habilitaCamion;

    public Categoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public Categoria(String nombrecategoria, double sueldo, boolean habilitaColectivoLinea,
            boolean habilitaColectivoLarga, boolean habilitaCamion) {
        this.nombrecategoria = nombrecategoria;
        this.sueldo = sueldo;
        this.habilitaColectivoLinea = habilitaColectivoLinea;
        this.habilitaColectivoLarga = habilitaColectivoLarga;
        this.habilitaCamion = habilitaCamion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public boolean isHabilitaColectivoLinea() {
        return habilitaColectivoLinea;
    }

    public void setHabilitaColectivoLinea(boolean habilitaColectivoLinea) {
        this.habilitaColectivoLinea = habilitaColectivoLinea;
    }

    public boolean isHabilitaColectivoLarga() {
        return habilitaColectivoLarga;
    }

    public void setHabilitaColectivoLarga(boolean habilitaColectivoLarga) {
        this.habilitaColectivoLarga = habilitaColectivoLarga;
    }

    public boolean isHabilitaCamion() {
        return habilitaCamion;
    }

    public void setHabilitaCamion(boolean habilitaCamion) {
        this.habilitaCamion = habilitaCamion;
    }
}
