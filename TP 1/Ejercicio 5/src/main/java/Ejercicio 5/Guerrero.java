package modelo;

public class Guerrero{
    private String nombre;
    private double vitalidad;
    private double armadura;
    private double x;
    private double y;

    public double getVitalidad(){
        return this.vitalidad;
    }

    public void setVitalidad(double vitalidad){
        this.vitalidad = vitalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArmadura() {
        return armadura;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}