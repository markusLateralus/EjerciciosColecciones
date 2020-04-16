package ejercicios.coleccion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BuscarAnagramaMap {

	
/*
 * 
 * Dada una lista de palabras que se pasan como argumento al programa (args) indique los
anagramas que contiene. Anagramas son dos palabras que contienen las mismas letras pero
en distintos orden (roma-amor, zorra-arroz, ladron-roldan). Para ello utilice un
Map<K,V>. Como pista indicar que dos anagramas, al ordenarlos, quedan iguales. Para
ordenar un String lo mejor es pasarlo a un array de caracteres (toCharArray) y luego
ordenarlo con sort de Arrays.

 * */	
	
	
 Anigrama anigramaUno;
 Anigrama anigramaDos;

	public boolean sonAnagramas(Anigrama anigramaUno, Anigrama anigramaDos) {
		this.anigramaUno=anigramaUno;
	 this.anigramaDos=anigramaDos;
		//convertimos las dos palabras en minusculas y las guardamos en un arreglo tipo char
     char[] c1 = anigramaUno.nombre.toCharArray();
     char[] c2 = anigramaDos.nombre.toCharArray();
     //los pasamos a un arrayList
     ArrayList <Character>listaC1=new ArrayList<Character>();
     for (int i = 0; i < c1.length; i++) {
			listaC1.add(c1[i]);
		}
     
  
     ArrayList <Character>listaC2=new ArrayList<Character>();
     for (int i = 0; i < c2.length; i++) {
			listaC2.add(c2[i]);
		}
     
     //ordenamos
     
     Collections.sort(listaC1);
     Collections.sort(listaC2);
     HashMap<Integer,ArrayList<Character>>anigramas=new HashMap<Integer, ArrayList<Character>>();
		
     anigramas.put((Integer)anigramaUno.valor, listaC1);
     anigramas.put((Integer)anigramaDos.valor, listaC2);
           
    boolean resultado= anigramas.get(1).equals(anigramas.get(2));
    
    return resultado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BuscarAnagramaMap buscador=new BuscarAnagramaMap();
		 Anigrama anigramaUno=new Anigrama("ola",1);
		 Anigrama anigramaDos=new Anigrama("alu",2);
		 System.out.println( buscador.sonAnagramas(anigramaUno, anigramaDos));
		

        
   
        
	}

}
class Anigrama{
	public String nombre;
	public int valor;
	public Anigrama(String nombre, int valor) {
		this.nombre=nombre;
		this.valor=valor;
	}
	@Override
	public int hashCode() {
		
	return valor;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anigrama other = (Anigrama) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
	
}
