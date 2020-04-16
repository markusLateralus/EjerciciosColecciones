package conjuntos;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenados {

	public static void main(String[] args) {
	

		ArrayList miColeccion = new ArrayList();
		miColeccion.add(1);
		miColeccion.add(4);
		miColeccion.add(7);
		miColeccion.add(47);
		miColeccion.add(2);
		
		//ordenamos este conjunto con sort
		Collections.sort(miColeccion);
		System.out.println(miColeccion);
		
		//ordenar en orden invertido
		Collections.reverse(miColeccion);
		System.out.println(miColeccion);

	}
}
