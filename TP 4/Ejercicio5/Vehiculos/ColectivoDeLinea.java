package Ejercicio5.Vehiculos;

import Ejercicio5.Choferes.*;

public class ColectivoDeLinea extends Colectivo {

    public ColectivoDeLinea(String modelo) {
        super(modelo);
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().isHabilitaColectivoLinea();
    }

    @Override
    public String toString() {
        return "Tipo de vehiculo: colectivo de linea\n" + super.toString();
    }
}
