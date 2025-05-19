package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextPane;

import Ejercicio2.Modelo.Empresa;
import Ejercicio2.Modelo.Llamado;
import Templates.Menu;

public class LlamadoMasUrgente extends Menu implements ILlamadoMasUrgente {
    private JTextPane informacion;
    private static String SIN_LLAMADOS = "Sin llamados aún";

    public LlamadoMasUrgente(String arg0) {
        ArrayList<String> nombresBotones = new ArrayList<>(Arrays.asList("Atender", "Volver al menú principal"));
        this.setearAtributos("Llamado más urgente: ", nombresBotones);
        this.configurarVentana(arg0);
        this.configurarTitulo();
        this.add(this.informacion);
        this.agregarBotones(nombresBotones, ILlamadoMasUrgente.comandos);
        this.agregarBotonFinal(nombresBotones, ILlamadoMasUrgente.comandos);
    }

    @Override
    protected void setearAtributos(String titulo, ArrayList<String> nombresBotones) {
        super.setearAtributos(titulo, nombresBotones);
        this.informacion = new JTextPane();
        this.informacion.setText(SIN_LLAMADOS);
    }

    @Override
    public void actualizar() {
        Llamado llamado = Empresa.getInstancia().getOpE().consultaElemento();
        if (llamado == null) {
            this.informacion.setText(SIN_LLAMADOS);
        } else {
            this.informacion.setText(llamado.toString());
        }
    }

    @Override
    public void hacerVisible() {
        this.actualizar();
        this.setVisible(true);
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

    @Override
    public void hacerInvisible() {
        this.setVisible(false);
    }

    @Override
    protected int getCantidadFilas() {
        return super.getCantidadFilas()+1;
    }
}
