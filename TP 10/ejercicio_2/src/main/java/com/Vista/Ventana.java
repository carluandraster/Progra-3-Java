package com.Vista;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Ventana extends JFrame implements IVista {
	// Botones de números
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;

	// Otros botones
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnIgual;
	private JButton btnCE;
	private JButton btnComa;

	// Pantalla
	private JTextArea input;
	private JTextPane output;

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 854, 553);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelContenedor = new JPanel();
		this.getContentPane().add(panelContenedor);
		panelContenedor.setLayout(new GridLayout(1, 3));

		JPanel panel_izquierdo = new JPanel();
		panelContenedor.add(panel_izquierdo);

		JPanel panel_central = new JPanel();
		panelContenedor.add(panel_central);
		panel_central.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel pantalla = new JPanel();
		panel_central.add(pantalla);
		pantalla.setLayout(new GridLayout(2, 1, 0, 0));

		this.input = new JTextArea();
		pantalla.add(input);
		this.input.setEditable(false);
		this.input.setFont(new Font(Font.SERIF, Font.ROMAN_BASELINE, 36));

		this.output = new JTextPane();
		pantalla.add(output);
		this.output.setEditable(false);
		this.output.setText("0");
		this.output.setAlignmentX(120);
		this.output.setFont(new Font(Font.SERIF, Font.ROMAN_BASELINE, 36));
		StyledDocument doc = this.output.getStyledDocument();
		SimpleAttributeSet derecha = new SimpleAttributeSet();
		StyleConstants.setAlignment(derecha, StyleConstants.ALIGN_RIGHT);
		doc.setParagraphAttributes(0, doc.getLength(), derecha, false);

		JPanel panel_botones1 = new JPanel();
		panel_central.add(panel_botones1);
		panel_botones1.setLayout(new GridLayout(2, 5, 0, 0));

		this.btn7 = new JButton("7");
		this.btn7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn7);

		this.btn8 = new JButton("8");
		this.btn8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn8);

		this.btn9 = new JButton("9");
		this.btn9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn9);

		JPanel panel_2 = new JPanel();
		panel_botones1.add(panel_2);

		this.btnCE = new JButton("CE");
		this.btnCE.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btnCE);

		this.btn4 = new JButton("4");
		this.btn4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn4);

		this.btn5 = new JButton("5");
		this.btn5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn5);

		this.btn6 = new JButton("6");
		this.btn6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btn6);

		this.btnMultiplicar = new JButton("×");
		this.btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btnMultiplicar);

		this.btnDividir = new JButton("/");
		this.btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones1.add(this.btnDividir);

		JPanel panel_botones2 = new JPanel();
		panel_central.add(panel_botones2);
		panel_botones2.setLayout(new GridLayout(2, 5, 0, 0));

		this.btn1 = new JButton("1");
		this.btn1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btn1);

		this.btn2 = new JButton("2\r\n");
		this.btn2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btn2);

		this.btn3 = new JButton("3");
		this.btn3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btn3);

		this.btnSuma = new JButton("+");
		this.btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btnSuma);

		this.btnResta = new JButton("-");
		this.btnResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btnResta);

		this.btn0 = new JButton("0");
		this.btn0.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btn0);

		this.btnComa = new JButton(",");
		this.btnComa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btnComa);

		JPanel panel = new JPanel();
		panel_botones2.add(panel);

		JPanel panel_1 = new JPanel();
		panel_botones2.add(panel_1);

		this.btnIgual = new JButton("=");
		this.btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_botones2.add(this.btnIgual);

		JPanel panel_derecho = new JPanel();
		panelContenedor.add(panel_derecho);
	}

	@Override
	public void escribirCaracter(char c) {
		this.input.append(String.valueOf(c));
	}

	@Override
	public void escribirOutput(String mensaje) {
		this.output.setText(mensaje);
	}

	@Override
	public void limpiarPantalla() {
		this.input.setText("");
		this.output.setText("0");
	}

	@Override
	public void setActionListener(ActionListener al) {
		this.btn0.addActionListener(al);
		this.btn0.setActionCommand(CERO);

		this.btn1.addActionListener(al);
		this.btn1.setActionCommand(UNO);

		this.btn2.addActionListener(al);
		this.btn2.setActionCommand(DOS);

		this.btn3.addActionListener(al);
		this.btn3.setActionCommand(TRES);

		this.btn4.addActionListener(al);
		this.btn4.setActionCommand(CUATRO);

		this.btn5.addActionListener(al);
		this.btn5.setActionCommand(CINCO);

		this.btn6.addActionListener(al);
		this.btn6.setActionCommand(SEIS);

		this.btn7.addActionListener(al);
		this.btn7.setActionCommand(SIETE);

		this.btn8.addActionListener(al);
		this.btn8.setActionCommand(OCHO);

		this.btn9.addActionListener(al);
		this.btn9.setActionCommand(NUEVE);

		this.btnComa.addActionListener(al);
		this.btnComa.setActionCommand(COMA);

		this.btnSuma.addActionListener(al);
		this.btnSuma.setActionCommand(MAS);

		this.btnResta.addActionListener(al);
		this.btnResta.setActionCommand(MENOS);

		this.btnMultiplicar.addActionListener(al);
		this.btnMultiplicar.setActionCommand(POR);

		this.btnDividir.addActionListener(al);
		this.btnDividir.setActionCommand(DIVIDIR);

		this.btnIgual.addActionListener(al);
		this.btnIgual.setActionCommand(IGUAL);

		this.btnCE.addActionListener(al);
		this.btnCE.setActionCommand(CE);
	}

}
