package codigo;

import java.io.IOException;

import codigo.Modelo.Flota;
import codigo.Persistencia.PersistenciaBinaria;
import codigo.Persistencia.PersistenciaXML;

public class PruebaLectura {
    public static void main(String[] args) throws IOException {
        Flota flota = null;
        PersistenciaXML pb = new PersistenciaXML();

        try {
            pb.abrirInput("ejercicio_1/Archivos/flota.dat");
            flota = (Flota) pb.leer();
            pb.cerrarInput();
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(flota.getNombre());
        System.out.println(flota.getVehiculos());
    }

}
