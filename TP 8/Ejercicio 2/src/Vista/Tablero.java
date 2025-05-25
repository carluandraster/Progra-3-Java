package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Modelo.Buscaminas;
import Modelo.ICelda;
import Modelo.Excepciones.FueraTableroException;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Tablero extends JFrame implements MouseListener, ITablero{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panelBuscaminas;
	private JPanel panelLateralIzquierdo;
	private PanelConCelda[][] casilleros;
	private Recursos recursos = new Recursos();
	private ActionListener actionListener;
	private JButton botonReiniciar;
	private JButton botonVolver;

	/**
	 * Create the frame.
	 */
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panelLateralIzquierdo = new JPanel();
		contentPane.add(panelLateralIzquierdo, BorderLayout.WEST);
		panelLateralIzquierdo.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panelLateralIzquierdo.add(panel);
		
		JPanel panelContenedorFormulario = new JPanel();
		panelLateralIzquierdo.add(panelContenedorFormulario);
		panelContenedorFormulario.setLayout(new GridLayout(3,1, 0, 0));
		
		JPanel panelAncho = new JPanel();
		panelContenedorFormulario.add(panelAncho);
		panelAncho.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel AnchoLabel = new JLabel("Ancho (máximo 20)");
		panelAncho.add(AnchoLabel);
		AnchoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AnchoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setEditable(false);
		panelAncho.add(textField);
		textField.setColumns(10);
		
		JPanel panelAlto = new JPanel();
		panelContenedorFormulario.add(panelAlto);
		panelAlto.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel AltoLabel = new JLabel("Alto (máximo 20)");
		panelAlto.add(AltoLabel);
		AltoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AltoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panelAlto.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panelCantidad = new JPanel();
		panelContenedorFormulario.add(panelCantidad);
		panelCantidad.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel cantidadLabel = new JLabel("Cantidad de minas");
		panelCantidad.add(cantidadLabel);
		cantidadLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cantidadLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panelCantidad.add(textField_2);
		textField_2.setColumns(10);
		
		this.panelBuscaminas = new JPanel();
		contentPane.add(panelBuscaminas, BorderLayout.CENTER);
		
		// Botones del cartelito final
		this.botonReiniciar = new JButton("Reiniciar");
		this.botonReiniciar.setActionCommand(ITablero.REINICIAR);
		this.botonVolver = new JButton("Volver al Menú Principal");
		this.botonVolver.setActionCommand(ITablero.VOLVER);
	}
	
	@Override
	public void dibujar(Buscaminas tablero) {
		for (int i = 0; i < tablero.getAlto(); i++)
			for (int j = 0; j < tablero.getAncho(); j++) {
				if (tablero.getMatriz()[i][j].isPisado()) {
					this.casilleros[i][j].setBorder(new BevelBorder(BevelBorder.LOWERED));
					try {
						if (tablero.isMina(i, j)) {
							this.casilleros[i][j].setImageIcon(recursos.getExplosion());
						} else {
							if (tablero.getMinasCercanas(i, j) > 0)
								this.casilleros[i][j].setImageIcon(recursos.getNumero(tablero.getMinasCercanas(i, j)));
						}
					} catch (FueraTableroException e) {
						throw new InternalError();
					}

				} else {
					if (tablero.getMatriz()[i][j].isMarcado())
						this.casilleros[i][j].setImageIcon(recursos.getBandera());
					else
						this.casilleros[i][j].setImageIcon(null);
				}
			}
		this.repaint();
	}

	@Override
	public void dibujarFinal(Buscaminas tablero) {
		for (int i = 0; i < tablero.getAlto(); i++)
			for (int j = 0; j < tablero.getAncho(); j++) {
				try {
					if (tablero.isMina(i, j)) {
						if (tablero.getMatriz()[i][j].isPisado())
							this.casilleros[i][j].setImageIcon(recursos.getExplosion());
						else
							this.casilleros[i][j].setImageIcon(recursos.getMina());
					}
				} catch (FueraTableroException e) {
					throw new InternalError();
				}
			}
		this.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		ActionEvent event;
		String command;
		ICelda celda = (ICelda) e.getSource();
		if (e.getButton() != 1)
			command = "MARCAR";
		else
			command = "PISAR";
		event = new ActionEvent(celda, 0, command);
		this.actionListener.actionPerformed(event);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarJuego(int alto, int ancho, int cantidad) {
		this.panelBuscaminas.removeAll();
		this.panelBuscaminas.setLayout(new GridLayout(alto, ancho));
		
		this.casilleros = new PanelConCelda[alto][ancho];
		
		textField.setText(""+ ancho);
		textField_1.setText(""+ alto);
		textField_2.setText(""+cantidad);
		
		for (int i = 0; i < alto; i++)
			for(int j = 0; j < ancho; j++) {
				this.casilleros[i][j] = new PanelConCelda(i, j);
				this.casilleros[i][j].setBorder(new BevelBorder(BevelBorder.RAISED));
				this.panelBuscaminas.add(this.casilleros[i][j]);
				this.casilleros[i][j].addMouseListener(this);
			}
		this.setBounds(100, 100, this.panelLateralIzquierdo.getWidth() + 152 * ancho, 152 * alto);
		this.setVisible(true);
	}

	@Override
	public void perder() {
		Object[] opciones = { this.botonReiniciar, this.botonVolver };
		JOptionPane.showOptionDialog(
				null,
				"Has perdido",
				"Game Over",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				opciones[1]);
	}

	@Override
	public void ganar() {
		Object[] opciones = { this.botonReiniciar, this.botonVolver };
		JOptionPane.showOptionDialog(
				null,
				"Has ganado",
				"¡¡¡Felicitaciones!!!",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				opciones[1]);
	}

	@Override
	public void hacerInvisible() {
		this.setVisible(false);
	}

	@Override
	public void setActionListener(ActionListener al) {
		this.actionListener = al;
		this.botonReiniciar.addActionListener(al);
		this.botonVolver.addActionListener(al);
	}

}
