package conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetComparando {

	
	public static void main(String[] args) {
		
		 //HashSet
		Socio socioUno=new Socio("a", 20);
		Socio socioDos=new Socio("b", 30);
		Socio socioTres=new Socio("c", 35);
		Socio socioCuatro=new Socio("a", 20);
		
		HashSet<Socio> lista=new HashSet<Socio>();
		lista.add(socioUno);
		lista.add(socioDos);
		lista.add(socioTres);
		lista.add(socioCuatro);
		
		//vamos a comparar socioUno y socioCuatro
		System.out.println("¿son iguales socioUno y socioCuatro ? " + socioUno.equals(socioCuatro));//true
		//siendo true...uno de los dos no puede estar en la lista...vamos a leerla
		for (Socio socio : lista) {
			System.out.println(socio.nombre);  // c b a
		}
		
	}
}
class Socio {
	
	String nombre;
	int edad;
	public Socio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {   //este metodo es el que usamos
		Socio socio=(Socio)obj;
		return nombre.equals(socio.nombre) && edad==socio.edad;
	}
	
}