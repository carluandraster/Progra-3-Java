public abstract class Material {
    protected String color;

    public Material(String color) {
        this.color = color;
    }

    public abstract String trabajado(String tipo);
}
