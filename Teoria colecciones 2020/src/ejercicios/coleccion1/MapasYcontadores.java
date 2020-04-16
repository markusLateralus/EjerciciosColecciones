package ejercicios.coleccion1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapasYcontadores {
/*
 * 
 * Use otro directorio Map<K,V> para contar palabras iguales. Deberá buscar cada palabra y
si ya está incrementar el contador asociado. Si no está deberá insertarla con el contador a 1.
 * 
 * 
 * 
 * */
	            //NO ESTÁ COMPLETO
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palabra palabraUno=new Palabra("marcos");
		Palabra palabraDos=new Palabra("jose");
		Palabra palabraTres=new Palabra("emilio");
		Palabra palabraCuatro=new Palabra("marcos");
		Palabra palabraCinco=new Palabra("maria");
		Palabra palabraSeis=new Palabra("sebastian");
		
		HashMap<Integer, Palabra> mapa=new HashMap<Integer,Palabra>();
		
		mapa.put(1,palabraUno);
		mapa.put(2,palabraDos);
		mapa.put(3,palabraTres);
		mapa.put(4,palabraCuatro);
		mapa.put(5,palabraCinco);
		mapa.put(6,palabraSeis);
		
		for (Map.Entry <Integer,Palabra> elemento: mapa.entrySet()) {
			String nombre=elemento.getValue().nombre;
			Integer key=elemento.getKey();
			System.out.println(key + " " +nombre);
		}
		
	
		Iterator<Map.Entry<Integer, Palabra>> iterador = mapa.entrySet().iterator();
		while (iterador.hasNext()) {
		    Map.Entry<Integer, Palabra> entry = iterador.next();
		    String nombre=entry.getValue().nombre;
		    if(mapa.get(nombre)==null) {
		    	mapa.put(entry.getKey(), entry.getValue());
		    	//TODO 
		    	System.out.println(mapa);
		    }
		}
		
		
	}

}

class Palabra{
	
	public String nombre;
	public Palabra(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabra other = (Palabra) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}


