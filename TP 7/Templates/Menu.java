package Templates;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Menu extends JFrame {

        protected JLabel titulo;
        protected HashMap<String, JButton> botones;

        public Menu() {
                super();
        }

        public Menu(String nombre, String titulo, ArrayList<String> nombresBotones, ArrayList<String> comandos) {
                // Atributos
                this.setearAtributos(titulo, nombresBotones);
                // Iniciar componentes
                this.configurarVentana(nombre);
                this.configurarTitulo();
                this.agregarBotones(nombresBotones, comandos);
                this.agregarBotonFinal(nombresBotones, comandos);
        }

        protected void setearAtributos(String titulo, ArrayList<String> nombresBotones) {
                this.titulo = new JLabel(titulo);
                this.botones = this.copiarClaves(nombresBotones);
        }

        protected HashMap<String, JButton> copiarClaves(ArrayList<String> claves) {
                Iterator<String> it = claves.iterator();
                HashMap<String, JButton> aux = new HashMap<>();

                while (it.hasNext()) {
                        aux.put(it.next(), null);
                }
                return aux;
        }

        protected void configurarVentana(String nombre) {
                this.setTitle(nombre);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridLayout(this.getCantidadFilas(), 1));
                this.setSize(1500, 1020);
        }

        protected void configurarTitulo() {
                this.titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
                this.titulo.setForeground(new java.awt.Color(0, 0, 0));
                this.titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                this.add(this.titulo);
        }

        protected void agregarBotones(ArrayList<String> nombresBotones, ArrayList<String> comandos) {
                int i;
                JButton boton;

                for (i = 0; i < nombresBotones.size(); i++) {
                        boton = new JButton(nombresBotones.get(i));
                        boton.setFont(new java.awt.Font("Segoe UI", 1, 48));
                        boton.setActionCommand(comandos.get(i));
                        this.add(boton);
                        this.botones.replace(nombresBotones.get(i), boton);
                }
        }

        protected void agregarBotonFinal(ArrayList<String> nombresBotones, ArrayList<String> comandos) {
                int i = nombresBotones.size() - 1;
                JButton boton;
                boton = new JButton(nombresBotones.get(i));
                boton.setFont(new java.awt.Font("Segoe UI", 1, 48));
                boton.setActionCommand(comandos.get(i));
                this.add(boton);
                this.botones.replace(nombresBotones.get(i), boton);
        }

        protected int getCantidadFilas() {
                return 1 + this.botones.size();
        }

        public HashMap<String, JButton> getBotones() {
                return this.botones;
        }

        public String getTitulo() {
                return titulo.getText();
        }
}
