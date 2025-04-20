public class CofreMaldicion implements Cofre {
    @Override
    public void lanzarHechizo(Personaje personaje) {
        personaje.hechizarse("Maldicion");
    }
}
