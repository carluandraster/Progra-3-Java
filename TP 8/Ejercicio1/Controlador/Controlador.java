package Ejercicio1.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JOptionPane;

import Ejercicio1.Modelo.*;
import Ejercicio1.Vista.IVista;

public class Controlador implements ActionListener {
    private IVista vista;

    public Controlador(IVista vista) {
        this.vista = vista;
        this.vista.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // public static String ATACAR = "atacar";
        // public static String CREAR_ARQUERO = "nuevo_arquero";
        // public static String CREAR_GUERRERO = "nuevo_guerrero";
        // public static String CREAR_CABALLERO = "nuevo_caballero";
        // public static String MOVER = "mover";

        if (comando.equalsIgnoreCase(IVista.ATACAR)) {
            Personaje atacante = this.vista.getAtacante();
            if (atacante == null) {
                JOptionPane.showMessageDialog(null, "No se seleccionó a ningún atacante",
                        "Dato Inválido", JOptionPane.ERROR_MESSAGE);
            } else {
                Personaje atacado = this.vista.getAtacado();
                if (atacado == null) {
                    JOptionPane.showMessageDialog(null, "No se seleccionó a ningún atacado",
                            "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        atacante.ataca(atacado);
                    } catch (AtaqueImposibleException e1) {
                        JOptionPane.showMessageDialog(null, e1.getMessage(),
                                "AtaqueImposibleException", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            if (comando.equalsIgnoreCase(IVista.CREAR_ARQUERO)) {
                String nombre = this.vista.getNombre();
                if (nombre.equals("")) {
                    JOptionPane.showMessageDialog(null, "No se ingresó un nombre",
                            "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                } else {
                    Mapa.get_instancia().agregarPersonaje(new Arquero(nombre));
                    HashMap<String, Personaje> personajes = Mapa.get_instancia().getPersonajes();
                    this.vista.actualizar(personajes.values().toArray(new Personaje[personajes.size()]));
                }
            } else {
                if (comando.equalsIgnoreCase(IVista.CREAR_GUERRERO)) {
                    String nombre = this.vista.getNombre();
                    if (nombre.equals("")) {
                        JOptionPane.showMessageDialog(null, "No se ingresó un nombre",
                                "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Mapa.get_instancia().agregarPersonaje(new Guerrero(nombre));
                    }
                } else {
                    if (comando.equalsIgnoreCase(IVista.CREAR_CABALLERO)) {
                        String nombre = this.vista.getNombre();
                        if (nombre.equals("")) {
                            JOptionPane.showMessageDialog(null, "No se ingresó un nombre",
                                    "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Mapa.get_instancia().agregarPersonaje(new Caballero(nombre));
                        }
                    } else {
                        if (comando.equalsIgnoreCase(IVista.CREAR_MAGO)) {
                            String nombre = this.vista.getNombre();
                            if (nombre.equals("")) {
                                JOptionPane.showMessageDialog(null, "No se ingresó un nombre",
                                        "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                            } else {
                                Mapa.get_instancia().agregarPersonaje(new Mago(nombre));
                            }
                        } else { // Mover
                            try {
                                double incX = this.vista.getIncX();
                                double incY = this.vista.getIncY();

                                Personaje p = this.vista.getAtacante();
                                if (p == null)
                                    p = this.vista.getAtacado();
                                if (p == null) {
                                    JOptionPane.showMessageDialog(null, "No se ha seleccionado a ningún personaje",
                                            "Dato Inválido", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    p.incrementaPos(incX, incY);
                                }
                            } catch (NumberFormatException e2) {
                                JOptionPane.showMessageDialog(null, "Un dato ingresado no corresponde con un número",
                                        "NumberFormatException", JOptionPane.ERROR_MESSAGE);
                            } catch (IncrementoImposibleException e3) {
                                JOptionPane.showMessageDialog(null, e3.getMessage(),
                                        "IncrementoImposibleException", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}
