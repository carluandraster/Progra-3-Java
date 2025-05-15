package Ejercicio2.Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado>{
    private ArrayList<Llamado> llamadosAtendidos;

    public OperadoraEmergencias(){
        super();
        this.llamadosAtendidos = new ArrayList<>();
    }

    public int cantidadLlamados(Socio socio){
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

    public Iterator<Llamado> getLlamadosAtendidos(){
        return this.llamadosAtendidos.iterator();
    }

    public Socio getSocioMasEmergencias(){
        Iterator<Llamado> it = this.llamadosAtendidos.iterator();
        HashMap<Socio, Integer> sociosConEmergencias = new HashMap<>();
        Socio aux;

        while (it.hasNext()) {
            aux = it.next().getSocio();
            if (sociosConEmergencias.containsKey(aux)) {
                sociosConEmergencias.replace(aux,sociosConEmergencias.get(aux)+1);
            } else {
                
            }
        }
    }
}
