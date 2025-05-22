package Ejercicio1.Modelo;

public class AtaqueImposibleException extends Exception {
    private Personaje atacante;
    private Personaje atacado;

    public AtaqueImposibleException(Personaje atacante, Personaje atacado) {
        super();
        this.atacado = atacado;
        this.atacante = atacante;
    }

    public Personaje getAtacante() {
        return atacante;
    }

    public Personaje getAtacado() {
        return atacado;
    }

}
