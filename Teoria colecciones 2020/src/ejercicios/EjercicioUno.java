package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EjercicioUno {

	//1º Calcular la suma de los valores contenidos en un ArrayList
	
	public static int suma() {
		int arreglo[]= {1,2,3,4,5};
		ArrayList<Integer> lista=new ArrayList();
		for (int i = 0; i < arreglo.length; i++) {
			lista.add(arreglo[i]);
		}
		
		int contador=0;
		for (int i = 0; i < lista.size(); i++) {
			contador+= lista.get(i);
		
		}
	
		return contador;
	}
	
	//2º Calcular  la media aritmética de los valores contenidos en un ArrayList.
	public static int media() {
		int arreglo[]= {1,2,3,4,5};
		ArrayList<Integer> lista=new ArrayList();
		for (int i = 0; i < arreglo.length; i++) {
			lista.add(arreglo[i]);
		}
		
		int totalLista=lista.size();
		int media= suma()/totalLista;
		return media;
	}
	
	
//	3º. Rotar los elementos de un ArrayList (El ultimo se convierte en el primero 
//	y el resto de numeros se desplaza una posición a la derecha) .
	
	public static ArrayList<Integer> rotar(){
		ArrayList<Integer> lista=new ArrayList();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		int total=lista.size();
		for (ListIterator iterator = lista.listIterator(); iterator.hasNext();) {
			Integer object = (Integer) iterator.next();
			if(object.equals(lista.get(total-1))) {
				lista.remove(total-1);
				lista.add(0, object);			
				
		}

		}
		return lista;
	}
	
	
	
	public static void main(String[] args) {
		//ejercicio1
		System.out.println("la suma es " + suma());
		System.out.println("la media es " +media());
		System.out.println("la rotación es " + rotar());
	}

}
