package Vista;

import java.awt.event.ActionListener;

public interface IFormulario {
	public static String INICIAR_JUEGO = "iniciar";
	
	public int getAlto();
	public int getAncho();
	public int getCantidadDeMinas();
	public void hacerVisible();
	public void hacerInvisible();
	public void setActionListener(ActionListener al);
}
