package Ejercicio8;

public class Jugador {
    private String nombre;
    private int anioNacimiento;
    private int numCamiseta;
    private int posicion;
    private int partidosJugados;
    private int cantGolesCampeonato;

    public Jugador(String nombre, int anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public Jugador(String nombre, int anioNacimiento, int numCamiseta, int posicion, int partidosJugados,
            int cantGolesCampeonato) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.numCamiseta = numCamiseta;
        this.posicion = posicion;
        this.partidosJugados = partidosJugados;
        this.cantGolesCampeonato = cantGolesCampeonato;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getCantGolesCampeonato() {
        return cantGolesCampeonato;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void setCantGolesCampeonato(int cantGolesCampeonato) {
        this.cantGolesCampeonato = cantGolesCampeonato;
    }

}
