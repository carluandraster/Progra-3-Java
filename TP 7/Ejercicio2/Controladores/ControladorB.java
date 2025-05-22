package Ejercicio2.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Ejercicio2.Modelo.Empresa;
import Ejercicio2.Modelo.Llamado;
import Ejercicio2.Modelo.Socio;
import Ejercicio2.Vista.IncisoB.*;

public class ControladorB implements ActionListener {
    private IMenu menuPrincipal;
    private InterfazInscripcion formularioInscripcion;
    private ILlamadoMasUrgente llamadoMasUrgente;
    private ICrearLlamado crearLlamado;
    private IEstadisticas estadisticas;

    public ControladorB(IMenu menuPrincipal, InterfazInscripcion formularioInscripcion,
            ILlamadoMasUrgente llamadoMasUrgente, ICrearLlamado crearLlamado, IEstadisticas estadisticas) {
        this.setVistas(menuPrincipal, formularioInscripcion, llamadoMasUrgente, crearLlamado, estadisticas);
    }

    public void setVistas(IMenu menuPrincipal, InterfazInscripcion formularioInscripcion,
            ILlamadoMasUrgente llamadoMasUrgente, ICrearLlamado crearLlamado, IEstadisticas estadisticas) {
        this.menuPrincipal = menuPrincipal;
        this.menuPrincipal.setActionListener(this);
        this.formularioInscripcion = formularioInscripcion;
        this.formularioInscripcion.setActionListener(this);
        this.llamadoMasUrgente = llamadoMasUrgente;
        this.llamadoMasUrgente.setActionListener(this);
        this.crearLlamado = crearLlamado;
        this.crearLlamado.setActionListener(this);
        this.estadisticas = estadisticas;
        this.estadisticas.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // Opciones del menú principal
        if (comando.equalsIgnoreCase(IMenu.comandos.get(0))) { // Inscribir
            this.menuPrincipal.hacerInvisible();
            this.formularioInscripcion.hacerVisible();
        } else {
            if (comando.equalsIgnoreCase(IMenu.comandos.get(1))) { // registrar
                this.menuPrincipal.hacerInvisible();
                HashMap<Integer,Socio> socios = Empresa.getInstancia().getSocios();
                this.crearLlamado.actualizar(socios.keySet().toArray(new Integer[socios.size()]));
                this.crearLlamado.hacerVisible();
            } else {
                if (comando.equalsIgnoreCase(IMenu.comandos.get(2))) { // atender
                    this.menuPrincipal.hacerInvisible();
                    this.llamadoMasUrgente.hacerVisible();
                } else {
                    if (comando.equalsIgnoreCase(IMenu.comandos.get(3))) { // estadísticas
                        this.menuPrincipal.hacerInvisible();
                        HashMap<Integer,Socio> socios = Empresa.getInstancia().getSocios();
                        this.estadisticas.actualizar(socios.keySet().toArray(new Integer[socios.size()]));
                        this.estadisticas.hacerVisible();
                    } else {
                        // Opciones del formulario de inscripción
                        if (comando.equalsIgnoreCase(InterfazInscripcion.comandos.get(0))) { // Agregar socio
                            String nombre = this.formularioInscripcion.getNombre();
                            int dni = this.formularioInscripcion.getDNI();
                            String domicilio = this.formularioInscripcion.getDomicilio();
                            Empresa.getInstancia().agregarSocio(nombre, dni, domicilio);
                            this.formularioInscripcion.reset();
                        } else {
                            // Volver al menú principal del formulario de inscripción
                            if (comando.equalsIgnoreCase(InterfazInscripcion.comandos.get(1))) {
                                this.formularioInscripcion.hacerInvisible();
                                this.menuPrincipal.hacerVisible();
                            } else {
                                // Crear llamado
                                // Enviar
                                if (comando.equalsIgnoreCase(ICrearLlamado.comandos.get(0))) {
                                    int dni = this.crearLlamado.getDNI();
                                    Socio socio = Empresa.getInstancia().getSocios().get(dni);
                                    int prioridad = this.crearLlamado.getPrioridad();
                                    Llamado nuevoLlamado = new Llamado(prioridad, socio);
                                    Empresa.getInstancia().getOpE().agrega(nuevoLlamado);
                                } else {
                                    // Volver al menú principal de crear llamado
                                    if (comando.equalsIgnoreCase(ICrearLlamado.comandos.get(1))) {
                                        this.crearLlamado.hacerInvisible();
                                        this.menuPrincipal.hacerVisible();
                                    } else {
                                        // Llamado más urgente
                                        // Atender llamado
                                        if (comando.equalsIgnoreCase(ILlamadoMasUrgente.comandos.get(0))) {
                                            Empresa.getInstancia().getOpE().getElemento();
                                            this.llamadoMasUrgente.actualizar();
                                        } else {
                                            // Volver al menú principal de atender
                                            if (comando.equalsIgnoreCase(ILlamadoMasUrgente.comandos.get(1))) {
                                                this.llamadoMasUrgente.hacerInvisible();
                                                this.menuPrincipal.hacerVisible();
                                            } else {
                                                // Estadísticas
                                                // Buscar socio por DNI
                                                if (comando.equalsIgnoreCase(IEstadisticas.BUSCAR)) {
                                                    int dni = this.estadisticas.getDNI();
                                                    Socio socio = Empresa.getInstancia().getSocios().get(dni);
                                                    JOptionPane.showMessageDialog(null,
                                                            "Cantidad de llamados que realizó el socio: " + Empresa
                                                                    .getInstancia().getOpE().cantidadLlamados(socio),
                                                            "Información del socio", JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                    // Obtener listado de llamados atendidos
                                                    if (comando.equalsIgnoreCase(IEstadisticas.comandos.get(0))) {
                                                        StringBuilder sb = new StringBuilder();
                                                        Iterator<Llamado> it = Empresa.getInstancia().getOpE()
                                                                .getLlamadosAtendidos();
                                                        while (it.hasNext()) {
                                                            sb.append("-------------------------\n");
                                                            sb.append(it.next().toString() + "\n");
                                                        }
                                                        JOptionPane.showMessageDialog(null, sb.toString(),
                                                                "Listado de llamados atendidos",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                                    } else {
                                                        // Volver al menú principal de las estadísticas
                                                        this.estadisticas.hacerInvisible();
                                                        this.menuPrincipal.hacerVisible();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
