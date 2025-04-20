public class CofreBendicion implements Cofre {
    @Override
    public void lanzarHechizo(Personaje personaje) {
        personaje.hechizarse("Bendicion");
    }
}
