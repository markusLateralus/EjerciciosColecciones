package colas;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioridad {

	/*
	 *  una cola de prioridades puede agregar elementos SIEMPRE QUE SE COMPAREN CON COMPARABLE O CON UN COMPARATOR
	 * 
	 * */
	public static void main(String[] args) {
	
		/*     esto es lo que no se debe hacer
		 * 
		
		PriorityQueue<Personal> priorityPersonal=new PriorityQueue<Personal>();
		priorityPersonal.add(new Personal("antonio",1));
		priorityPersonal.add(new Personal("jose",2));
		priorityPersonal.add(new Personal("emilio",3));
     	priorityPersonal.add(new Personal("marcos",1));
		priorityPersonal.add(new Personal("alejo",1));
		
		 */
		
		//no existe COMPARATOR...da error
		//System.out.println(priorityPersonal);//Exception in thread "main" java.lang.ClassCastException: colas.Personal cannot be cast to java.lang.Comparable
	
	
		//lo solucionamos creando un comparator en este ámbito
	Comparator<Personal> comparador=new Comparator<Personal>() {

		@Override
		public int compare(Personal o1, Personal o2) {
			//aquí realizamos la comparaciíon
			return o1.prioritario - o2.prioritario;
		}
		
	};
	PriorityQueue<Personal> priorityPersonal2=new PriorityQueue<Personal>(comparador); //agregamos a los parámetros del constructor el comparador
	priorityPersonal2.add(new Personal("antonio",1));
	priorityPersonal2.add(new Personal("jose",2));
	priorityPersonal2.add(new Personal("emilio",3));
	priorityPersonal2.add(new Personal("marcos",1));
	priorityPersonal2.add(new Personal("alejo",1));
	while(!priorityPersonal2.isEmpty()) {
		//priorityPersonal2.poll();
		System.out.println(priorityPersonal2.poll()); //antonio
		                                              //alejo
		                                              //marcos
													  //jose0
													  //emilio
	}
	
	
	
	
	
	
	}

}
