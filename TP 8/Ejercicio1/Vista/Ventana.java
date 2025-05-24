package Ejercicio1.Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Ejercicio1.Modelo.Personaje;

public class Ventana extends JFrame implements IVista {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JPanel panelEste;
	private JPanel panelAtacar;
	private JList<Personaje> listaIzquierda;
	private JList<Personaje> listaDerecha;
	private JButton botonAtacar;
	private JPanel crearPersonaje;
	private JPanel IngresarNombre;
	private JLabel NombreLabel;
	private JPanel ArqueroPanel;
	private JButton BotonArquero;
	private JPanel GuerreroPanel;
	private JButton botonGuerrero;
	private JPanel CaballeroPanel;
	private JButton botonCaballero;
	private JPanel panel_contenedor;
	private JTextField inputNombre;
	private JPanel panel;
	private JLabel incXLabel;
	private JTextField inputIncX;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel incYLabel;
	private JTextField inputIncY;
	private JButton botonMover;
	private JPanel panel_3;
	private JPanel MagoPanel;
	private JButton botonMago;
	private DefaultListModel<Personaje> listaDePersonajes;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		this.panelCentral = new JPanel();
		this.contentPane.add(this.panelCentral, BorderLayout.CENTER);
		this.panelCentral.setLayout(new GridLayout(1, 3, 0, 0));

		this.listaIzquierda = new JList<Personaje>();
		this.panelCentral.add(this.listaIzquierda);

		this.panelAtacar = new JPanel();
		this.botonAtacar = new JButton("Atacar");
		this.botonAtacar.setBackground(new Color(255, 255, 255));
		this.panelAtacar.add(this.botonAtacar);
		this.panelCentral.add(this.panelAtacar);

		this.listaDerecha = new JList<Personaje>();
		this.panelCentral.add(this.listaDerecha);

		this.panelSur = new JPanel();
		this.contentPane.add(this.panelSur, BorderLayout.SOUTH);

		this.panelEste = new JPanel();
		this.contentPane.add(this.panelEste, BorderLayout.EAST);
		this.panelEste.setLayout(new GridLayout(2, 1));

		this.crearPersonaje = new JPanel();
		this.panelEste.add(this.crearPersonaje);
		this.crearPersonaje.setLayout(new GridLayout(5, 1));

		this.IngresarNombre = new JPanel();
		this.crearPersonaje.add(this.IngresarNombre);
		this.IngresarNombre.setLayout(new BorderLayout(0, 0));

		this.NombreLabel = new JLabel("Nombre: ");
		this.IngresarNombre.add(this.NombreLabel, BorderLayout.WEST);
		this.NombreLabel.setVerticalAlignment(JLabel.TOP);

		this.panel_contenedor = new JPanel();
		this.IngresarNombre.add(this.panel_contenedor, BorderLayout.CENTER);

		this.inputNombre = new JTextField();
		this.inputNombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.inputNombre.setColumns(10);
		this.panel_contenedor.add(this.inputNombre);

		// Botón de arquero
		this.ArqueroPanel = new JPanel();
		this.crearPersonaje.add(this.ArqueroPanel);
		this.BotonArquero = new JButton("Arquero");
		this.ArqueroPanel.add(this.BotonArquero);

		// Botón de guerrero
		this.GuerreroPanel = new JPanel();
		this.crearPersonaje.add(this.GuerreroPanel);
		this.botonGuerrero = new JButton("Guerrero");
		this.GuerreroPanel.add(this.botonGuerrero);

		// Botón de caballero
		this.CaballeroPanel = new JPanel();
		this.crearPersonaje.add(this.CaballeroPanel);
		this.botonCaballero = new JButton("Caballero");
		this.CaballeroPanel.add(this.botonCaballero);

		// Botón de mago
		this.MagoPanel = new JPanel();
		this.crearPersonaje.add(this.MagoPanel);
		this.botonMago = new JButton("Mago");
		this.MagoPanel.add(this.botonMago);

		this.panel = new JPanel();
		this.panelEste.add(this.panel);
		this.panel.setLayout(new GridLayout(3, 1, 0, 0));

		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);

		this.incXLabel = new JLabel("incX: ");
		this.panel_1.add(this.incXLabel);

		this.inputIncX = new JTextField();
		this.panel_1.add(this.inputIncX);
		this.inputIncX.setColumns(10);

		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2);

		this.incYLabel = new JLabel("incY: ");
		this.panel_2.add(this.incYLabel);

		this.inputIncY = new JTextField();
		this.panel_2.add(this.inputIncY);
		this.inputIncY.setColumns(10);

		this.panel_3 = new JPanel();
		this.panel.add(this.panel_3);

		this.botonMover = new JButton("Mover");
		this.panel_3.add(this.botonMover);

		this.setearComandos();

		this.configurarLista();

		this.setVisible(true);
	}

	private void configurarLista() {
		this.listaDePersonajes = new DefaultListModel<>();
		this.listaIzquierda.setModel(this.listaDePersonajes);
		this.listaDerecha.setModel(this.listaDePersonajes);
	}

	public void setearComandos() {
		this.botonAtacar.setActionCommand(IVista.ATACAR);
		this.botonCaballero.setActionCommand(IVista.CREAR_CABALLERO);
		this.botonGuerrero.setActionCommand(IVista.CREAR_GUERRERO);
		this.botonMover.setActionCommand(IVista.MOVER);
		this.BotonArquero.setActionCommand(IVista.CREAR_ARQUERO);
		this.botonMago.setActionCommand(IVista.CREAR_MAGO);
	}

	@Override
	public String getNombre() {
		return this.inputNombre.getText();
	}

	@Override
	public Personaje getAtacado() {
		return this.listaDerecha.getSelectedValue();
	}

	@Override
	public Personaje getAtacante() {
		return this.listaIzquierda.getSelectedValue();
	}

	@Override
	public double getIncX() {
		return Double.parseDouble(this.inputIncX.getText());
	}

	@Override
	public double getIncY() {
		return Double.parseDouble(this.inputIncY.getText());
	}

	@Override
	public void actualizar(Personaje personajes[]) {
		this.listaDePersonajes.clear();

		for (Personaje personaje : personajes) {
			this.listaDePersonajes.addElement(personaje);
		}
	}

	@Override
	public void setActionListener(ActionListener al) {
		this.botonAtacar.addActionListener(al);
		this.botonCaballero.addActionListener(al);
		this.botonGuerrero.addActionListener(al);
		this.botonMover.addActionListener(al);
		this.BotonArquero.addActionListener(al);
	}
}
