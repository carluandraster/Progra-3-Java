public class AtaqueImposibleException extends Exception {
    private Personaje atacante;
    private Personaje atacado;

    public AtaqueImposibleException(Personaje atacante, Personaje atacado) {
        super(atacante.getNombre() + " quiso atacar a " + atacado.getNombre() + " desde muy lejos");
        this.atacante = atacante;
        this.atacado = atacado;
    }

    public Personaje getAtacante() {
        return atacante;
    }

    public Personaje getAtacado() {
        return atacado;
    }
}
