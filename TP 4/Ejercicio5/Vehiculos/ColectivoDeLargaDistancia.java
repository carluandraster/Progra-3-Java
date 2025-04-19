package Ejercicio5.Vehiculos;

import Ejercicio5.Choferes.*;

public class ColectivoDeLargaDistancia extends Colectivo {
    private boolean cocheCama;

    public ColectivoDeLargaDistancia(String modelo, boolean cocheCama) {
        super(modelo);
        this.cocheCama = cocheCama;
    }

    public boolean isCocheCama() {
        return cocheCama;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().isHabilitaColectivoLarga();
    }

    @Override
    public String toString() {
        String aux;
        if (this.cocheCama)
            aux = "Coche cama: SÍ\n";
        else
            aux = "Coche cama: NO\n";
        return "Tipo de vehiculo: colectivo de larga distancia\n" + super.toString() + aux;
    }
}
