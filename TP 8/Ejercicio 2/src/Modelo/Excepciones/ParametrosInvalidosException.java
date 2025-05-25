package Modelo.Excepciones;

public class ParametrosInvalidosException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int alto;
	private int ancho;
	private int cantidadMinas;
	
	public ParametrosInvalidosException(String mensaje,int alto, int ancho, int cantidadMinas) {
		super(mensaje);
		this.alto = alto;
		this.ancho = ancho;
		this.cantidadMinas = cantidadMinas;
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public int getCantidadMinas() {
		return cantidadMinas;
	}
}
