package ejemploSpring;

public class Personaje implements PuedeSaltar {

	@Override
	public void saltarHaciaArriba() {
		// TODO Auto-generated method stub
		
		System.out.println("Ha saltado para arriba");
		
	}

	@Override
	public void saltarHaciaAdelante() {
		// TODO Auto-generated method stub
		System.out.println("Ha saltado hacia adelante");
	}

}
