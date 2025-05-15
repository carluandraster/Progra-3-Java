package Ejercicio2.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Ejercicio2.Modelo.*;
import Ejercicio2.Vista.*;

public class Controlador implements ActionListener{
    private ListaConPrioridades<Llamado> lista;
    private IVista vista;

    public Controlador(ListaConPrioridades<Llamado> lista, IVista vista) {
        this.lista = lista;
        this.vista = vista;
        this.vista.setActionListener(this);
    }

    public void setVista(IVista vista) {
        this.vista = vista;
        this.vista.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre;
        int dni;
        String domicilio;
        int prioridad;
        Socio socio;
        Llamado llamado;
        String comando = e.getActionCommand();
        if (comando.equalsIgnoreCase(IVista.AGREGAR_LLAMADO)) {
            nombre = this.vista.getNombre();
            dni = this.vista.getDNI();
            domicilio = this.vista.getDomicilio();
            socio = new Socio(dni, nombre, domicilio);
            prioridad = this.vista.getPrioridad();
            llamado = new Llamado(prioridad, socio);
            this.lista.agrega(llamado);
            this.vista.actualizar(lista);
        } else { // ATENDER_LLAMADO
            this.lista.getElemento();
            this.vista.actualizar(lista);
        }
    }

    
}
