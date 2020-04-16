package ejercicios.coleccion1;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class DobleCompareTo {

	
	
	
/*
 * 
 * 4. Defina una lista List<E> con la clase Empleado antes definida (con nombre, apellidos,
fecha de contratación y número de empleado). Use la función sort de la clase Collections
para ordenar la lista. Use la antigüedad como criterio a seguir (es “mayor” si es más
antiguo) y si entraron en el mismo día, utilice el número de empleado para desempatar.
Esta ordenación se reflejará en un método de la clase Empleado, compareTo(obj o), que
permite comparar el objeto en curso (this) con el objeto recibido, que devuelve -1 si es
menor que el recibido, 0 si son iguales y 1 si es mayor que el recibido.
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleadoUno=new Empleado("marcos", "arrones",new GregorianCalendar(2000,Calendar.JANUARY,11),1);
		Empleado empleadoDos=new Empleado("paco", "garcia",new GregorianCalendar(20010,Calendar.JANUARY,01),5);
		Empleado empleadoTres=new Empleado("sergio", "sanchez",new GregorianCalendar(20010,Calendar.JANUARY,01),3);
		Empleado empleadoCuatro=new Empleado("luis", "arrones",new GregorianCalendar(2008,Calendar.AUGUST,01),4);
		LinkedList <Empleado> lista=new LinkedList<Empleado>();
	
		
		lista.add(empleadoUno);
		lista.add(empleadoDos);
		lista.add(empleadoTres);
		lista.add(empleadoCuatro);
		Collections.sort(lista);
		for (Empleado empleado : lista) {
			System.out.println(empleado.nombre + " " + empleado.fechaContratacion.get(Calendar.YEAR));//2000
		
		}

		
		
	}

}

class Empleado implements Comparable<Empleado>{
	public String nombre;
	public String apellido;
	public GregorianCalendar fechaContratacion;
	public int numeroEmpleados;
	public Empleado(String nombre, String apellido, GregorianCalendar fechaContratacion, int numeroEmpleados) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaContratacion = fechaContratacion;
		this.numeroEmpleados = numeroEmpleados;
	}
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		int resultado=fechaContratacion.compareTo(o.fechaContratacion);
		if(resultado==0) {
			int re=new Integer(o.numeroEmpleados).compareTo(new Integer(numeroEmpleados));
			return re;
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "Empleado " + nombre + ", fechaContratacion=" + fechaContratacion + ", numeroEmpleados="
				+ numeroEmpleados + "";
	}


	
	
	
}
