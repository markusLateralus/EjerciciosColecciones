package ejercicios.coleccion1;

import java.util.HashSet;

public class ConjuntosYsubconjuntos {

/*
 * 
 * 10. Dados dos conjuntos de palabras imprima las que están en un conjunto u otro pero no en
los dos simultáneamente. Utilice la unión (addAll)
                       y la intersección (retainAll)se usa para eliminar todos los elementos de la lista de matriz
                        que no están contenidos en la colección especificada o retiene todos los elementos coincidentes 
                        en la instancia actual de ArrayList que coinciden con todos los elementos de la lista de Colección 
                        pasados ​​como un parámetro para el método.
                        
                        
 * */
	
	
	public static HashSet<String> conjuntoPares=new HashSet<String>();;
	 public static HashSet<String> conjuntoImpares=new HashSet<String>();;
	
	
	
	public static HashSet<String> obtenerElementosRepetidos(){
		conjuntoPares.retainAll(conjuntoImpares);
	System.out.println("los elementos comunes de los dos conjuntos son: " + conjuntoPares);// segundo
	return conjuntoPares;
	
	}
	
	public static HashSet<String> obtenerTodosElementosSinRepetir(){
		conjuntoPares.addAll(conjuntoImpares);
		System.out.println("los elemenos no repetidos de los dos conjuntos son " + conjuntoPares);//segundo, primero,tercero, quinto
		return conjuntoPares;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabraUno="primero";
		String palabraDos="segundo";
		String palabraTres="tercero";
		String palabraCuatro="cuarto";
		String palabraCinco="quinto";
		String palabraSeis="sexto";
		
		
	//	HashSet<String> conjuntoPares=new HashSet<String>();
		conjuntoPares.add(palabraDos);
		conjuntoPares.add(palabraCuatro);
		conjuntoPares.add(palabraSeis);
	//	HashSet<String> conjuntoImpares=new HashSet<String>();
		conjuntoImpares.add(palabraUno);
		conjuntoImpares.add(palabraDos);//COMUN
		conjuntoImpares.add(palabraTres);
		conjuntoImpares.add(palabraCinco);
		
		obtenerElementosRepetidos();
		obtenerTodosElementosSinRepetir();
	
	}

}
