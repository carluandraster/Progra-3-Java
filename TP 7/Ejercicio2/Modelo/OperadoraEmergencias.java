package Ejercicio2.Modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado> {
    private ArrayList<Llamado> llamadosAtendidos;

    public OperadoraEmergencias() {
        super();
        this.llamadosAtendidos = new ArrayList<>();
    }

    public int cantidadLlamados(Socio socio) {
        int contador = 0;
        Llamado aux;

        // Contar los llamados no atendidos de la cola
        int N = this.elementos.size();
        for (int i = 0; i < N; i++) {
            aux = this.elementos.poll();
            if (aux.getSocio() == socio) {
                contador++;
            }
            this.elementos.add(aux);
        }

        // Contar los elementos ya atendidos del socio
        Iterator<Llamado> it = this.llamadosAtendidos.iterator();
        while (it.hasNext()) {
            if (it.next().getSocio() == socio) {
                contador++;
            }
        }

        return contador;
    }

    public Iterator<Llamado> getLlamadosAtendidos() {
        return this.llamadosAtendidos.iterator();
    }

    public Socio getSocioMasEmergencias() {
        Iterator<Llamado> it = this.llamadosAtendidos.iterator();
        HashMap<Socio, Integer> sociosConEmergencias = new HashMap<>();
        Socio aux = null;
        int maximo = -1;

        // Recopilo a los socios con sus ocurrencias
        while (it.hasNext()) {
            aux = it.next().getSocio();
            if (sociosConEmergencias.containsKey(aux)) {
                sociosConEmergencias.replace(aux, sociosConEmergencias.get(aux) + 1);
            } else {
                sociosConEmergencias.put(aux, 0);
            }
        }

        // Recorro HashMap
        for (Map.Entry<Socio, Integer> entry : sociosConEmergencias.entrySet()) {
            // clave= entry.getKey()
            // valor= entry.getValue()
            if (entry.getValue() > maximo) {
                aux = entry.getKey();
                maximo = entry.getValue();
            }
        }

        return aux;
    }

    @Override
    public Llamado getElemento() {
        Llamado aux = super.getElemento();
        aux.setFechahoraAtendido(new GregorianCalendar());
        this.llamadosAtendidos.add(aux);
        return aux;
        /*
         * No podíamos setear fechahoraAtendido en la clase ListaConPrioridades porque
         * ListaConPrioridades es una cola de tipo genérico. No se sabe de qué tipo son
         * los objetos que contiene por lo que solo podíamos invocar a los métodos de
         * Comparable y de Object.
         */
    }

}
