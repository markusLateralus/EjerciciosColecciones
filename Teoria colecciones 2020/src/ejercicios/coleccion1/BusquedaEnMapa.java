package ejercicios.coleccion1;

import java.util.HashMap;
import java.util.Map;

public class BusquedaEnMapa {

	
	
/*
 * Defina e implemente un directorio de teléfonos mediante un Map<K, V>. En el mismo
tendrá entradas de agenda con los campos anteriores. Se buscará por el nombre y apellidos
y devolverá la entrada de agenda correspondiente. Pruebe a insertar unas pocas entradas y
luego a buscar alguna de ellas. Pruebe a insertar dos nombre iguales, que cambie
simplemente en el orden de los apellidos.
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgendaTelefonica agendaUno=new AgendaTelefonica(666666661);
		AgendaTelefonica agendaDos=new AgendaTelefonica(666666662);
		AgendaTelefonica agendaTres=new AgendaTelefonica(666666663);
		AgendaTelefonica agendaCuatro=new AgendaTelefonica(666666664);
		
		Directorio directorioUno= new Directorio("marcos", "arrones");
		Directorio directorioDos= new Directorio("ana", "alcañiz");
		Directorio directorioTres= new Directorio("sonia", "sanchez");
		Directorio directorioCuatro= new Directorio("paco", "Lujuria");
		
		HashMap< Directorio, AgendaTelefonica>contactos=new HashMap<Directorio, AgendaTelefonica>();
		contactos.put(directorioUno, agendaUno);
		contactos.put(directorioDos, agendaDos);
		contactos.put(directorioTres, agendaTres);
		contactos.put(directorioCuatro, agendaCuatro);
		
		//busqueda por apellido
		for (Map.Entry <Directorio,AgendaTelefonica> elemento: contactos.entrySet()) {
			if(elemento.getKey().apellido.equals("arrones"))
			System.out.println(elemento.getValue().numero);
		
		}
		
		//busqueda por nombre
		for (Map.Entry <Directorio,AgendaTelefonica> elemento: contactos.entrySet()) {
			if(elemento.getKey().nombre.equals("sonia"))
			System.out.println(elemento.getValue().numero);
		
		}
		
		//cambiar nombre de un objeto Directorio y ponerlo igual que otro objeto del mapa
			directorioDos.nombre="sonia";
			int contador=1;
			for (Map.Entry <Directorio,AgendaTelefonica> elemento: contactos.entrySet()) {
				if(elemento.getKey().nombre.equals("sonia")) {
					System.out.println(contador+ " teléfono encontrado... " + elemento.getValue().numero);
					contador++;
				}
			
			
			}
		
		
		
		
		

}
}

class Directorio{
	
	public String nombre;
	public String apellido;
	public Directorio(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
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
		Directorio other = (Directorio) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}
	
	


class AgendaTelefonica{
	public long numero;
	public AgendaTelefonica(long numero) {
		this.numero=numero;
	}
}




