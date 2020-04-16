package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Lista {

	public static void main(String[] args) {
		//como pasar un arreglo a una lista
		String palabras[]= {"primero", "segundo", "tercero", "cuarto"};	
		List <String>listaPalabras=Arrays.asList(palabras);
		
		/*
		ARRAY LIST
		no estan ordenado
		no puedes pedir un elemento concreto, debe buscarlo
		añadir: add()
		*/
		// si sabes la naturaleza de un objeto no
		// debes usar upcasting
		ArrayList miColeccion;
		// muy importante ver la biblioteca que se importa porque puede venir de
		// otro sitio y nosotros solo queremos java.util.*
		miColeccion = new ArrayList();
		miColeccion.add(1);
		miColeccion.add(2);
		miColeccion.add(3);
		miColeccion.add(4);
		miColeccion.add(5);

		//reemplazar un elemento  set(posicion, elemento)
		//ahora me da error porque el objeto es de tipo Collection
		miColeccion.set(0, 3);
		
		//introducir en una posicion NO valida
		try {
			
			miColeccion.set(124, 4);
		} catch (Exception e) {
			System.out.println(" 124 posicion no valida");
		}
		
		// puedes recorrela
		for (Object object : miColeccion) {
			System.out.println(object);
		}
		// como conocer la posicion de un elemento
	System.out.println("donde esta el nueve? " + miColeccion.indexOf(9));
	// preguntar si contiene un elemento en la lista
	System.out.println("esta el nueve? " + miColeccion.contains(9));
	
	/*
	 * NO se pueden modificar mientras se recorrren
	 * 
	 * SOLUCION
	 * 
	 * crear un iterador
	 */
	//esta estructura sirve para pedir el siguiente elemento de una lista, cuando ya no haya elementos se sale de FOR
	//aki podemos MODIFICAR los elementos del arrayList
	//tambien sirve para BORRAR elementos
	for (Iterator iterator = miColeccion.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		//iterator.remove();
		System.out.println(object + "puedo modificarte");
	}
	
	
	
	/*
	 *  LIST ITERATOR
	 *
	 *puede recorrer la lista hacia ATRÁS, agregar, borrar
	 */
	ListIterator espeIterator=miColeccion.listIterator();
	for (ListIterator iterator = miColeccion.listIterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(iterator.previous());
		System.out.println(iterator.next());
		
	}
	
	//anade al comienzo de la lista (iterator)
	espeIterator.add(18);
	//una vez recorrido el iterador ya está consumido y para volver a recorrerlo debemos reasignarlo
	espeIterator.remove();
	espeIterator=miColeccion.listIterator();
	//para ver el elemento agregado, recorremos nuevamente la lista 
	while(espeIterator.hasNext()) {
		System.out.println(espeIterator.next());
	}
	
	

	
	}
	

	
	
}
