package Vista;

import java.awt.event.ActionListener;

import Modelo.Buscaminas;

public interface ITablero {
	public static String VOLVER = "volver";
	public static String REINICIAR = "reiniciar";
	
	public void setActionListener(ActionListener al);
	public void iniciarJuego(int alto, int ancho, int cantidad);
	public void perder();
	public void ganar();
	public void hacerInvisible();
	public void dibujar(Buscaminas tablero);
	public void dibujarFinal(Buscaminas tablero);
}
