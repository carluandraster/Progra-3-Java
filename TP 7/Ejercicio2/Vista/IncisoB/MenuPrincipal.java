package Ejercicio2.Vista.IncisoB;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JButton;

import Templates.Menu;

public class MenuPrincipal extends Menu implements IMenu {
    public MenuPrincipal(String nombre) {
        super(nombre, "Menu principal", new ArrayList<>(
                Arrays.asList("Inscribir un socio", "Registrar llamado", "Atender llamado", "Ver estadísticas")),
                IMenu.comandos);
        this.setVisible(true);
    }

    @Override
    public void setActionListener(ActionListener al) {
        for (Map.Entry<String, JButton> entrada : this.botones.entrySet()) {
            entrada.getValue().addActionListener(al);
        }
    }

}
