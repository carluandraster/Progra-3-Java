package codigo;

import java.io.IOException;
import java.util.ArrayList;

import codigo.Modelo.Flota;
import codigo.Modelo.Vehiculo;
import codigo.Persistencia.PersistenciaBinaria;
import codigo.Persistencia.PersistenciaXML;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota("Mi flotita");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        PersistenciaBinaria pb = new PersistenciaBinaria();
        PersistenciaXML px = new PersistenciaXML();
        String archivoBin = "ejercicio_1/Archivos/flota.dat";
        String archivoXML = "ejercicio_1/Archivos/flota.xml";

        vehiculos.add(new Vehiculo("DHUWHDW8UWA000237", 2017));
        vehiculos.add(new Vehiculo("SGRSGRGEHNA136214", 2013));
        vehiculos.add(new Vehiculo("DKJISEPNCVG853574", 2020));
        vehiculos.add(new Vehiculo("MDJSLSPERJS834662", 2024));
        vehiculos.add(new Vehiculo("JTFDTGRHTJA745643", 2019));
        flota.setVehiculos(vehiculos);

        try {
            // Persistencia binaria
            pb.abrirOutput(archivoBin);
            pb.escribir(flota);
            pb.cerrarOutput();

            // Peristencia XML
            px.abrirOutput(archivoXML);
            px.escribir(flota);
            px.cerrarOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}