package ejercicios.coleccion1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IterandoConLinkedList {
	/*
	 * 
	 * Use el interfaz List<E> para guardar una lista de n�meros. Los n�meros se pasar�n a trav�s
de los argumentos del programa (el args de main) y se transformar�n en enteros con el
m�todo parseInt de la clase Integer, para luego a�adirlos al final de la lista con el m�todo
add. Cuando ya no haya m�s n�meros, imprima el n�mero de elementos le�dos (size).
Luego eleve todos al cuadrado (use get y set). Recorra la lista y suprima los n�mero
mayores de 100 (use iterator). Ahora ord�nelos (use sort de la clase Collections). Una vez
hecho esto, saque (use remove) de la lista los n�meros, respetando su nuevo orden, e
impr�malos.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arregloNumeros[]= {"1","2","8","12"};
		LinkedList<Integer>lista=new LinkedList<Integer>();
		//pasamos el arreglo a la lista y realizamos la conversi�n de String a Integer mediante forEach
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
