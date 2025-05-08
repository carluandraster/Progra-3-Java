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
        String comando = e.getActionCommand();
        if (comando.equalsIgnoreCase(IVista.AGREGAR_LLAMADO)) {
            
        } else {
            
        }
    }

    
}
