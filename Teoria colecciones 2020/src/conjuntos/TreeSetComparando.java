package conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparando {

	public static void main(String[] args) {
		
		
		//sin repeticiiones y ordenados
		//se ordena con equals
		TreeSet<String> palabrasSet=new TreeSet<String>();
		String palabras[]= {"primero", "segundo", "tercero", "cuarto"};	
		
		//agregar 
		palabrasSet.add(palabras[0]);
		String palabraNueva="primero";
		System.out.println(palabrasSet); //[primero]
	
		
		//ahora si intento almacenar el mismo elemento NO ME LO PERMITE
		palabrasSet.add(palabraNueva);
		System.out.println(palabrasSet);//[primero], solo tenemos un elemento
		
		
		//para comparar usamos COMPARE TO
		// Nunca con   equals  =>System.out.println("¿son iguales ? " + palabraNueva.equals(palabrasSet.first()));// TRUE
		Socia socioUno=new Socia("a", 20);
		Socia socioDos=new Socia("b", 30);
		Socia socioTres=new Socia("c", 35);
		Socia socioCuatro=new Socia("a", 20);
		
		TreeSet<Socia> lista=new TreeSet<Socia>();
		lista.add(socioUno);
		lista.add(socioDos);
		lista.add(socioTres);
		lista.add(socioCuatro);
		//comparamos..
		System.out.println("¿son iguales socioUno y socioCuatro? " + socioUno.compareTo(socioCuatro));//trrue

		
	}
}
class Socia implements Comparable <Socia>{
	
	String nombre;
	int edad;
	public Socia(String nombre, int edad) {
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
	public int compareTo(Socia o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
