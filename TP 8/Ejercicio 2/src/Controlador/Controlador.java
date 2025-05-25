package Controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import Modelo.Buscaminas;
import Modelo.Casillero;
import Modelo.Excepciones.ParametrosInvalidosException;
import Modelo.ICelda;
import Vista.IFormulario;
import Vista.ITablero;

public class Controlador implements ActionListener {
	private IFormulario formulario;
	private ITablero juego;
	private Buscaminas modelo;
	

	public Controlador(IFormulario formulario, ITablero juego) {
		super();
		this.formulario = formulario;
		this.formulario.setActionListener(this);
		this.juego = juego;
		this.juego.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equalsIgnoreCase(IFormulario.INICIAR_JUEGO)) {
			int alto = this.formulario.getAlto();
			int ancho = this.formulario.getAncho();
			int cantidadMinas = this.formulario.getCantidadDeMinas();
			try {
				this.modelo = new Buscaminas(ancho, alto, cantidadMinas);
			} catch (ParametrosInvalidosException e1) {
				throw new InternalError(); // Los parámetros no deberían ser inválidos porque ya los validó la ventana
			}
			this.formulario.hacerInvisible();
			this.juego.iniciarJuego(alto, ancho, cantidadMinas);
		}
		else if(comando.equalsIgnoreCase("MARCAR")) {
			ICelda celda = (ICelda) e.getSource();
			this.modelo.getMatriz()[celda.getI()][celda.getJ()].marcar();
			this.juego.dibujar(this.modelo);
		}
		else if(comando.equalsIgnoreCase("PISAR")) {
			ICelda celda = (ICelda) e.getSource();
			int i = celda.getI();
			int j = celda.getJ();
			Casillero casillero = this.modelo.getMatriz()[i][j];
			this.modelo.pisar(i,j);
			this.modelo.setPisadas(this.modelo.getPisadas() + 1);
			if(casillero.isMina()) {
				this.juego.dibujarFinal(this.modelo);
				this.juego.perder();
			}	
			else
				if(this.modelo.getPisadas() + this.modelo.getCantidadDeMinas() == this.modelo.getAlto()*this.modelo.getAncho()) {
					this.juego.dibujarFinal(this.modelo);
					this.juego.ganar();
				}else
					this.juego.dibujar(this.modelo);
		}
		else if(comando.equalsIgnoreCase(ITablero.REINICIAR)) {
			int ancho = this.modelo.getAlto();
			int alto = this.modelo.getAncho();
			int cantidadMinas = this.modelo.getCantidadDeMinas();
			try {
				this.modelo = new Buscaminas(ancho, alto, cantidadMinas);
			} catch (ParametrosInvalidosException e1) {
				throw new InternalError();
			}
			this.juego.iniciarJuego(ancho, alto, cantidadMinas);
			SwingUtilities.getWindowAncestor((Component)e.getSource()).dispose();
		}
		else { // Volver al menú principal
			this.juego.hacerInvisible();
			this.formulario.hacerVisible();
			SwingUtilities.getWindowAncestor((Component)e.getSource()).dispose();
		}
	}

}
