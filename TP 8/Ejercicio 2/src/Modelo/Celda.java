package Modelo;

public class Celda implements ICelda {

	private int i;
    private int j;

    @Override
    public int getI()
    {
	return i;
    }

    @Override
    public int getJ()
    {
	return j;
    }

    public Celda(int i, int j)
    {
	super();
	this.i = i;
	this.j = j;
    }

}
