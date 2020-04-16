package ejercicios.coleccion1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IterandoConLinkedList {
	/*
	 * 
	 * Use el interfaz List<E> para guardar una lista de números. Los números se pasarán a través
de los argumentos del programa (el args de main) y se transformarán en enteros con el
método parseInt de la clase Integer, para luego añadirlos al final de la lista con el método
add. Cuando ya no haya más números, imprima el número de elementos leídos (size).
Luego eleve todos al cuadrado (use get y set). Recorra la lista y suprima los número
mayores de 100 (use iterator). Ahora ordénelos (use sort de la clase Collections). Una vez
hecho esto, saque (use remove) de la lista los números, respetando su nuevo orden, e
imprímalos.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arregloNumeros[]= {"1","2","8","12"};
		LinkedList<Integer>lista=new LinkedList<Integer>();
		//pasamos el arreglo a la lista y realizamos la conversión de String a Integer mediante forEach
		for (String valor :arregloNumeros) {
			lista.add(Integer.valueOf(valor));
		}
		
		//nos pide que elevemos al cuadrado los valores de la lista, lo que hacemos es SUSTITUIR cada elemento
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, (int) Math.pow(lista.get(i), 2)); //set() sustituye un elemento por otro
		}
		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Integer valor = (Integer) iterator.next();
			if(valor>100) {
				System.out.println("elemento borrado: " + valor);
				iterator.remove();
			}
			
		}
		System.out.println(lista);
		
		
		//suprimir valores superior a cien en la lista
		
		
	}

}
