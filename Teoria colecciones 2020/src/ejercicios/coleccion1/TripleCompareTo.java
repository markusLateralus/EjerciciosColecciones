package ejercicios.coleccion1;

import java.util.ArrayList;
import java.util.Collections;

public class TripleCompareTo {

/*
 * 
 * Defina una lista List<E> con la clase que representa una entrada de una agenda, con el
nombre, primer apellido, segundo apellido, teléfono, e-mail y móvil. Use la función sort
para ordenarla. Use como criterio de ordenación los apellidos y luego el nombre.
 * 
 * 
 * */	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agendaUno=new Agenda("marcos", "arrones", "alcañiz",924660711,"marcos@gmail.com", 666666666);
		Agenda agendaDos=new Agenda("jose", "zambrano", "alcañiz",924660711,"marcos@gmail.com", 666666666);
		Agenda agendaTres=new Agenda("maria", "zurbaran", "alcañiz",924660711,"marcos@gmail.com", 666666666);
		Agenda agendaCuatro=new Agenda("sandra", "sanchez", "alcañiz",924660711,"marcos@gmail.com", 666666666);
		Agenda agendaCinco=new Agenda("alejandro", "arrones", "alcañiz",924660711,"marcos@gmail.com", 666666666);
		
		ArrayList<Agenda> listaAgenda=new ArrayList<Agenda>();
		listaAgenda.add(agendaUno);
		listaAgenda.add(agendaDos);
		listaAgenda.add(agendaTres);
		listaAgenda.add(agendaCuatro);
		listaAgenda.add(agendaCinco);
		
		Collections.sort(listaAgenda);
		for (Agenda agenda : listaAgenda) {
			System.out.println(agenda.primerApellido + " " + agenda.segundoApellido + " " + agenda.nombre);
		}
		
	}

	
}


class Agenda implements Comparable <Agenda>{
	public String nombre;
	public String primerApellido;
	public String segundoApellido;
	public long telefono;
	public String email;
	public long movil;
	public Agenda(String nombre, String primerApellido, String segundoApellido, long telefono, String email,
			long movil) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.email = email;
		this.movil = movil;
	}
	@Override
	public String toString() {
		return "" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + "";
	}
	@Override
	public int compareTo(Agenda o) {
		int resultado=primerApellido.compareTo(o.primerApellido);
		if(resultado==0) {
			 resultado=segundoApellido.compareTo(o.segundoApellido);
			if(resultado==0) {
				resultado=nombre.compareTo(o.nombre);
				return resultado;
			}
		}
		return resultado;
	}

	
}