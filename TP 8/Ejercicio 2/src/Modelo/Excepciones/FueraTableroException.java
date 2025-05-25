package Modelo.Excepciones;

public class FueraTableroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i;
	private int j;
	public FueraTableroException(String mensaje,int i, int j) {
		super(mensaje);
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	
	
}
