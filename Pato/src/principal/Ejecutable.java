package principal;


public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pato cuacua=new Pato(5);
		
		cuacua.AndarHaciaAdelante(5);
		cuacua.AndarHaciaAdelante(5);
		cuacua.AndarHaciaAdelante(10);
		//cuacua.AndarHaciaAtras(30);
		
		System.out.println("Estoy en la posición: "+(cuacua.DimePosicion()));
	}

}
