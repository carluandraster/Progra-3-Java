package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;

public class Directorio extends Archivo {
    private HashMap<String, Archivo> archivos;
    private HashMap<String, Directorio> subdirectorios;

    public Directorio(String nombre) {
        super(nombre, 0);
        this.archivos = new HashMap<>();
        this.subdirectorios = new HashMap<>();
    }

    public void agregar(Directorio directorio) {
        this.subdirectorios.put(directorio.nombre, directorio);
    }

    public void agregar(Archivo archivo) {
        this.archivos.put(archivo.nombre, archivo);
    }

    public HashMap<String, Archivo> getArchivos() {
        return archivos;
    }

    public HashMap<String, Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    @Override
    public double getTamanio() {
        double tamanio = 0;
        Iterator<Directorio> itD = this.subdirectorios.values().iterator();
        Iterator<Archivo> itA = this.archivos.values().iterator();
        while (itD.hasNext())
            tamanio += itD.next().getTamanio();
        while (itA.hasNext())
            tamanio += itA.next().getTamanio();
        return tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Directorio> itD = this.subdirectorios.values().iterator();
        Iterator<Archivo> itA = this.archivos.values().iterator();
        String[] lineas;
        sb.append(super.toString() + "\n");
        while (itD.hasNext()) {
            lineas = itD.next().toString().split("\n");
            // Agregar tabulación a cada línea
            for (String linea : lineas)
                sb.append("\t").append(linea).append("\n");
        }
        while (itA.hasNext()) {
            sb.append("\t" + itA.next() + "\n");
        }
        return sb.toString();
    }
}
