package Ejercicio1.Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JPanel panelEste;
	private JPanel panelAtacar;
	private JList listaIzquierda;
	private JList listaDerecha;
	private JButton btnNewButton;
	private JPanel crearPersonaje;
	private JPanel IngresarNombre;
	private JLabel NombreLabel;
	private JPanel ArqueroPanel;
	private JButton BotonArquero;
	private JPanel GuerreroPanel;
	private JButton btnNewButton_1;
	private JPanel CaballeroPanel;
	private JButton btnNewButton_2;
	private JPanel panel_contenedor;
	private JTextField textField;
	private JPanel panel;
	private JLabel incXLabel;
	private JTextField textField_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel incYLabel;
	private JTextField textField_2;
	private JButton btnNewButton_3;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		this.panelCentral.setLayout(new BorderLayout(0, 0));
		
		this.panelAtacar = new JPanel();
		this.panelCentral.add(this.panelAtacar, BorderLayout.CENTER);
		
		this.btnNewButton = new JButton("Atacar");
		this.btnNewButton.setBackground(new Color(255, 255, 255));
		this.btnNewButton.addActionListener(this);
		this.panelAtacar.add(this.btnNewButton);
		
		this.listaIzquierda = new JList();
		this.panelCentral.add(this.listaIzquierda, BorderLayout.WEST);
		
		this.listaDerecha = new JList();
		this.panelCentral.add(this.listaDerecha, BorderLayout.EAST);
		
		this.panelSur = new JPanel();
		this.contentPane.add(this.panelSur, BorderLayout.SOUTH);
		
		this.panelEste = new JPanel();
		this.contentPane.add(this.panelEste, BorderLayout.EAST);
		this.panelEste.setLayout(new GridLayout(2, 1));
		
		this.crearPersonaje = new JPanel();
		this.panelEste.add(this.crearPersonaje);
		this.crearPersonaje.setLayout(new GridLayout(4,1));
		
		
		
		this.IngresarNombre = new JPanel();
		this.crearPersonaje.add(this.IngresarNombre);
		this.IngresarNombre.setLayout(new BorderLayout(0, 0));
		
		this.NombreLabel = new JLabel("Nombre: ");
		this.IngresarNombre.add(this.NombreLabel, BorderLayout.WEST);
		this.NombreLabel.setVerticalAlignment(JLabel.TOP);
		
		this.panel_contenedor = new JPanel();
		this.IngresarNombre.add(this.panel_contenedor, BorderLayout.CENTER);
		
		this.textField = new JTextField();
		this.textField.setHorizontalAlignment(SwingConstants.CENTER);
		this.textField.setColumns(10);
		this.panel_contenedor.add(this.textField);
		
		this.ArqueroPanel = new JPanel();
		this.crearPersonaje.add(this.ArqueroPanel);
		
		this.BotonArquero = new JButton("Arquero");
		this.BotonArquero.addActionListener(this);
		this.ArqueroPanel.add(this.BotonArquero);
		
		this.GuerreroPanel = new JPanel();
		this.crearPersonaje.add(this.GuerreroPanel);
		
		this.btnNewButton_1 = new JButton("Guerrero");
		this.GuerreroPanel.add(this.btnNewButton_1);
		
		this.CaballeroPanel = new JPanel();
		this.crearPersonaje.add(this.CaballeroPanel);
		
		this.btnNewButton_2 = new JButton("Caballero");
		this.CaballeroPanel.add(this.btnNewButton_2);
		
		this.panel = new JPanel();
		this.panelEste.add(this.panel);
		this.panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);
		
		this.incXLabel = new JLabel("incX: ");
		this.panel_1.add(this.incXLabel);
		
		this.textField_1 = new JTextField();
		this.panel_1.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2);
		
		this.incYLabel = new JLabel("incY: ");
		this.panel_2.add(this.incYLabel);
		
		this.textField_2 = new JTextField();
		this.panel_2.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		this.panel_3 = new JPanel();
		this.panel.add(this.panel_3);
		
		this.btnNewButton_3 = new JButton("Mover");
		this.panel_3.add(this.btnNewButton_3);
	}

	public void actionPerformed(ActionEvent e) {
	}
}
