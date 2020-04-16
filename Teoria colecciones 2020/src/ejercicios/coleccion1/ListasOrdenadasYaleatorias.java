package ejercicios.coleccion1;

import java.util.ArrayList;
import java.util.Collections;

public class ListasOrdenadasYaleatorias {

/*
 * 11. Dada una lista de palabras que se pasan como argumento al programa (args) imprimalas
ordenadas (sort de Collections) y luego según un orden aleatorio (shuffle de Collections)

 * 
 * 
 * 
 * 
 * */	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabraUno="primero";
		String palabraDos="segundo";
		String palabraTres="tercero";
		String palabraCuatro="cuarto";
		String palabraCinco="quinto";
		String palabraSeis="sexto";
		
		ArrayList <String>listaOrdenada=new ArrayList<String>();
		listaOrdenada.add(palabraUno);
		listaOrdenada.add(palabraDos);
		listaOrdenada.add(palabraTres);
		listaOrdenada.add(palabraCuatro);
		listaOrdenada.add(palabraCinco);
		listaOrdenada.add(palabraSeis);
		
		Collections.sort(listaOrdenada);
		System.out.println("ordenadas alfabéticamente:");
		for (String string : listaOrdenada) {
			System.out.println(string);
		}
		
		
		System.out.println("");
		
		
		Collections.shuffle(listaOrdenada);
		System.out.println("ordenada aleatoriamente");
		for (String string : listaOrdenada) {
			System.out.println(string);
		}
	}

}
