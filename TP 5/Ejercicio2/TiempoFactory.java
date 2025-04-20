public class TiempoFactory {
    private static TiempoFactory _instancia;

    private TiempoFactory() {
    }

    public static TiempoFactory getInstancia() {
        if (_instancia == null) {
            _instancia = new TiempoFactory();
        }
        return _instancia;
    }

    public Tiempo crearTiempo(int minutos, int segundos) {
        return new Tiempo(minutos, segundos);
    }
}
