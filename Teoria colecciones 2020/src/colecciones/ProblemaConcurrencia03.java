package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
 class Persona implements Comparable<Persona>{
	
	//para poder comparar objetos de esta clase dentro de una lista 
	//implementemos la interfaz y sobreescribimos los metodos necesarios
	public String nombre;
	public int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String toString() {
		return nombre+" "+edad;
	}
	@Override
	public int compareTo(Persona o) {
		return nombre.compareTo(o.nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj))
		return true;
		else{
			Persona parametro=(Persona)obj;
			return nombre.equals(parametro.nombre)&&edad==parametro.edad;
		}
	}

}
public class ProblemaConcurrencia03 {

	public static void main(String[] args) {
		ArrayList<Persona> listado = new ArrayList<Persona>();
		listado.add(new Persona("Luis", 12));
		listado.add(new Persona("Esteban", 18));
		listado.add(new Persona("Arturo", 14));
		listado.add(new Persona("Roberto", 19));
		System.out.println(listado);
		// Collections es una clase de utlidades para Collections
		//ordena la lista con Collections siempre que el tipo herede de Comparable
		Collections.sort(listado);
		System.out.println(listado);
		Persona person = new Persona("Benito", 12);
		// insertar ordenado
		// error por mnodificationexception
//		for (PersonaDos personaDos : listado) {
//			if (person.compareTo(personaDos) > 0) {
//				listado.add(person);
//			}
//		}
		//concurrent fallo porque inserto con listado aunque recorra con iterator
//		for (Iterator iterator = listado.iterator(); iterator.hasNext();) {
//			PersonaDos personaDos = (PersonaDos) iterator.next();
//			//por lo tanto el fallo de concuerrencia persiste si trabajo con la lista
//			if(person.compareTo(personaDos)>0) listado.add(person);
//		}
		
		
		// anado el elemento a traves de iterator
		// cuya funcion es senalar elementos de la lista, pero no es la lista
		for (ListIterator listIterator = listado.listIterator(); listIterator.hasNext();) {
			Persona persona = (Persona) listIterator.next();
			if(person.compareTo(persona)>0) listIterator.add(person);
		}
		System.out.println(listado);
	}

}
