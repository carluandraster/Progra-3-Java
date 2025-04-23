public class AtaqueImposibleException extends Exception {
    private Personaje atacante;
    private Personaje atacado;

    public AtaqueImposibleException(Personaje atacante, Personaje atacado) {
        super();
    }
}
