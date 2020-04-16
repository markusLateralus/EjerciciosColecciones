package ejercicios.coleccion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PalabrasRepetidasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BuscadorRepetidas palabraUno=new BuscadorRepetidas("primero",1);
		BuscadorRepetidas palabraDos=new BuscadorRepetidas("segundo",2);
		BuscadorRepetidas palabraTres=new BuscadorRepetidas("tercero",3);
		BuscadorRepetidas palabraCuatro=new BuscadorRepetidas("cuarto",4);
		BuscadorRepetidas palabraCinco=new BuscadorRepetidas("quinto",5);
		BuscadorRepetidas palabraSeis=new BuscadorRepetidas("primero",1); //REPETIDA  
		HashSet <BuscadorRepetidas>lista=new HashSet<BuscadorRepetidas>();
		
		lista.add(palabraUno);
		lista.add(palabraDos);
		lista.add(palabraTres);
		lista.add(palabraCuatro);
		lista.add(palabraCinco);
		lista.add(palabraSeis);  //AÑADIMOS LA REPETIDA

for (BuscadorRepetidas buscadorRepetidas : lista) {
	String nombre=buscadorRepetidas.nombre;
	System.out.println(nombre);

	
}
System.out.println("¿son iguales ? " + palabraUno.nombre.equals(palabraSeis.nombre));

	
	}
}
class BuscadorRepetidas{
	
	
	public String nombre;
	public  int valor;
	public BuscadorRepetidas(String nombre, int valor) {
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
		BuscadorRepetidas other = (BuscadorRepetidas) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
