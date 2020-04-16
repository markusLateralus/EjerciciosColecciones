package pilas;

import java.util.EmptyStackException;
import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		
		/*
		 * importante: siguen una estructura llamada LIFO: ultimo que entra primero que sale
		 * 
		 * */
		
		String palabras[]= {"primero", "segundo", "tercero", "cuarto"};	
		Stack <String> pilaPalabras=new Stack<String>();
		
		//colocar un elemento  en la cola
		pilaPalabras.push(palabras[0]);//pongo un elemento en la cola , el elemento 0 del arreglo
		pilaPalabras.push(palabras[1]);//pilaPalabras.push(palabras[0]);
		System.out.println(pilaPalabras); // [primero, segundo]
		
		
		//para eliminar el último elemento
		pilaPalabras.pop();
		System.out.println(pilaPalabras); //[primero]
		//pero...nos dara error si la pila está vacia
		//solucion
		try {
				pilaPalabras.pop(); //se queda vacía la pila despues de borrar este
			
		}
		catch(EmptyStackException e) {
			System.out.println("pila vacia");
		}
		
		
		//agregar un arreglo a la pila
		for (int i = 0; i < palabras.length; i++) {
			pilaPalabras.add(palabras[i]);
		}
		System.out.println(pilaPalabras);
		
		
		//obtener el ULTIMO elemento de la pila
			String palabra=pilaPalabras.peek();
			System.out.println(palabra);
		
			//comparar dos elementos con EQUALS
			String palabraNueva="primero";
			pilaPalabras.add(palabraNueva);		
		System.out.println("¿son iguales? " + palabraNueva.equals(palabras[0]) );
		

	}
}
