//aiv@ieslasfuentezuelas.com  -- correo del profesor
package principal;

public class Pato {
	
	
	private int Posicion;
	
	public Pato (int pos)
	{
		this.Posicion=pos;
	}
	
	public int AndarHaciaAdelante(int pasos)
	{
		return this.Posicion+=pasos;
	}
	
	public int AndarHaciaAtras(int pasos)
	{
		return this.Posicion-=pasos;
	}
	
	public int DimePosicion()
	{
		return this.Posicion;
	}

}
