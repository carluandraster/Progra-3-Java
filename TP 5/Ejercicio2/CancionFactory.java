public class CancionFactory {
    private static CancionFactory _instancia;

    private CancionFactory() {
    }

    public static CancionFactory getInstancia() {
        if (_instancia == null) {
            _instancia = new CancionFactory();
        }

        return _instancia;
    }

    public Cancion crearCancion(int numeroDePista, String titulo, int minutos, int segundos) {
        Tiempo t = TiempoFactory.getInstancia().crearTiempo(minutos, segundos);
        return new Cancion(numeroDePista, titulo, t);
    }
}
