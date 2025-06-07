package com.Vista;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;

import com.Modelo.Mascota;

@SuppressWarnings("deprecation")
public class Ventana extends JFrame implements Observer {
    private Container panelPrincipal;
    private JTextArea consola;

    public Ventana() {
        this.panelPrincipal = this.getContentPane();
        this.consola = new JTextArea();
        this.consola.setEditable(false);
        this.panelPrincipal.add(consola);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1024, 560);
    }

    @Override
    public void update(Observable o, Object arg) {
        int necesidad = (int) arg;
        Mascota mascota = (Mascota) o;
        switch (necesidad) {
            case 0:
                consola.append(mascota.getNombre() + " tiene sed\n");
                break;
            case 1:
                consola.append(mascota.getNombre() + " tiene hambre\n");
                break;
            case 2:
                consola.append(mascota.getNombre() + " está aburrido\n");
                break;
            default:
                throw new InternalError();
        }
    }
}
