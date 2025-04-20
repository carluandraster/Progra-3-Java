public abstract class Vehiculo implements Emisor_De_Sonido {
    private String Patente;
    private String numeroChasis;
    private String numeromotor;

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getNumeromotor() {
        return numeromotor;
    }

    public void setNumeromotor(String numeromotor) {
        this.numeromotor = numeromotor;
    }

}
