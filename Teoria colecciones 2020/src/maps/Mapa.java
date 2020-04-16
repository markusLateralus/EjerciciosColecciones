package maps;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	
	//DOS TIPOS
	//HashMap  desordenado
	//TreeMap   ORDENADO
	public static void main(String[] args) {
		//hashmap
		//insertar elemento con ...put()
		String palabras[]= {"primero", "segundo", "tercero", "cuarto"};	
		HashMap <Integer, String>mapaPalabras=new HashMap<Integer,String>();
		mapaPalabras.put(1, palabras[0]);
		System.out.println(mapaPalabras);// {1=primero}
		
		
		//como borrar un elemento...remove
		mapaPalabras.remove(1); // clave que quiero borrar
		System.out.println(mapaPalabras);//{}

	
		//como introducir un arreglo en un hashmap
		for (int i = 0; i < palabras.length; i++) {
			mapaPalabras.put(i, palabras[i]);
			
		}
		System.out.println(mapaPalabras);//{0=primero, 1=segundo, 2=tercero, 3=cuarto}

		//pedir un elemento del hashmap
		System.out.println(mapaPalabras.get(2));//   tercero
		
		
		
		
		
	}		
		
}
