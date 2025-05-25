package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Formulario extends JFrame implements KeyListener, IFormulario {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField AnchoInput;
	private JTextField AltoInput;
	private JTextField cantidadInput;
	private JButton BotonAceptar;

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panelAncho = new JPanel();
		contentPane.add(panelAncho);
		panelAncho.setLayout(new BorderLayout(0, 0));
		
		JLabel AnchoLabel = new JLabel("Ancho (máximo 20)");
		AnchoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAncho.add(AnchoLabel, BorderLayout.NORTH);
		AnchoLabel.setHorizontalAlignment(JLabel.CENTER);
		
		AnchoInput = new JTextField();
		panelAncho.add(AnchoInput, BorderLayout.CENTER);
		AnchoInput.setColumns(10);
		
		JPanel panelAlto = new JPanel();
		contentPane.add(panelAlto);
		panelAlto.setLayout(new BorderLayout(0, 0));
		
		JLabel AltoLabel = new JLabel("Alto (máximo 20)");
		panelAlto.add(AltoLabel, BorderLayout.NORTH);
		
		AltoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAlto.add(AltoLabel, BorderLayout.NORTH);
		AltoLabel.setHorizontalAlignment(JLabel.CENTER);
		
		AltoInput = new JTextField();
		panelAlto.add(AltoInput, BorderLayout.CENTER);
		AltoInput.setColumns(10);
		
		JPanel panelCantidadMinas = new JPanel();
		contentPane.add(panelCantidadMinas);
		panelCantidadMinas.setLayout(new BorderLayout(0, 0));
		
		JLabel cantidadLabel = new JLabel("Cantidad de minas");
		panelCantidadMinas.add(cantidadLabel, BorderLayout.NORTH);
		cantidadLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cantidadLabel.setHorizontalAlignment(JLabel.CENTER);
		
		cantidadInput = new JTextField();
		panelCantidadMinas.add(cantidadInput, BorderLayout.CENTER);
		cantidadInput.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		this.BotonAceptar = new JButton("Aceptar");
		this.BotonAceptar.setEnabled(false);
		panel.add(BotonAceptar);
		this.BotonAceptar.setActionCommand(IFormulario.INICIAR_JUEGO);
		
		this.AnchoInput.addKeyListener(this);
		this.AltoInput.addKeyListener(this);
		this.cantidadInput.addKeyListener(this);

		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int ancho = 0;
		int alto = 0;
		int cantidad = 0;
		boolean condicion;
		try {
			ancho = Integer.parseInt(this.AnchoInput.getText());
			alto = Integer.parseInt(this.AltoInput.getText());
			cantidad = Integer.parseInt(this.cantidadInput.getText());
		} catch (NumberFormatException e1) {
		}
		condicion = ancho > 0 && alto > 0 && cantidad > 0 && cantidad < ancho * alto && ancho <= 20 && alto <= 20;
		this.BotonAceptar.setEnabled(condicion);
	}

	@Override
	public int getAlto() {
		return Integer.parseInt(this.AltoInput.getText());
	}

	@Override
	public int getAncho() {
		return Integer.parseInt(this.AnchoInput.getText());
	}

	@Override
	public int getCantidadDeMinas() {
		return Integer.parseInt(this.cantidadInput.getText());
	}

	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}

	@Override
	public void hacerInvisible() {
		this.setVisible(false);
	}

	@Override
	public void setActionListener(ActionListener al) {
		this.BotonAceptar.addActionListener(al); 
	}

}
