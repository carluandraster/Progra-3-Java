package Ejercicio5;

public class Guerrero{
    private String nombre;
    private double vitalidad;
    private double armadura;
    private double x;
    private double y;

    // Getters y setters
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

    // Métodos

    public void mover(double inc_x,double inc_y){
        this.x += inc_x;
        this.y += inc_y;
    }

    public void recibeDano(double cantidad){
        if (cantidad > this.armadura) {
            this.vitalidad -= cantidad - this.armadura;
            this.armadura = 0;
        } else {
            this.armadura -= cantidad;
        }
    }
}