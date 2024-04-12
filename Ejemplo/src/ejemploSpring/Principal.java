package ejemploSpring;


import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Personaje p = new Personaje();
	List <PuedeSaltar> listaPuedeSaltar = new ArrayList <>();
		
	
	}
	
	public static void saltarTodos (List <PuedeSaltar> listaPuedeSaltar) {
			for (PuedeSaltar personaje : listaPuedeSaltar) {
				System.out.println(personaje);
			}
			
		}
	}
