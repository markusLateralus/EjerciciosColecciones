package maps;

import java.util.HashMap;

public class OperandoConDosClases {
	 public static void main(String[] args) {
		
		 Cliente clienteUno=new Cliente("jose",1,100);
		 Cliente clienteDos=new Cliente("jose",1,200);
		 Seguro hogar=new Seguro("hogar", 1,2);
		 //no ordena, tree sí
		 HashMap<Cliente, Seguro> enlace=new HashMap<Cliente, Seguro>();  //equals y hascode
		 
		 //agregar
		 enlace.put(clienteUno, hogar);
		 
		 
		 //comparamos con equals y hascode OBLIGATORIO
		 //si no los desarrollamos da un error tipo: NullPointerException
		 System.out.println(clienteUno.hashCode());
		 System.out.println(clienteDos.hashCode()); 
		 System.out.println("¿son iguales clienteUno y clienteDos ? " + clienteUno.equals(clienteDos));;
		 System.out.println(enlace.get(clienteUno).nombre); // da el mismo resultado
		 System.out.println(enlace.get(clienteDos).nombre); 

		 
		 //crear un hashmap de una clase usando como clave una propiedad suya
		 Cliente cliente=new Cliente("marcos",1,100);
		 HashMap<Long,Cliente> mapaClientes=new HashMap<Long,Cliente>();
		 mapaClientes.put(cliente.numeroCuenta, cliente);
		 Cliente buscarCliente=mapaClientes.get(cliente.numeroCuenta);
		 System.out.println(buscarCliente.nombre);
		 
	 
	 
	 }
	 
 }
 
 ///////////////////////////////
	 class Cliente{	
	public String nombre;
	public long numeroCuenta;
	public float saldo;
	
	public Cliente(String nombre, long numeroCuenta, float saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	@Override
	public int hashCode() {  // se usa para comparar hashmap  obligatorio
		return (int)numeroCuenta;
	}

	@Override
	public boolean equals(Object obj) { // se usa para comparar hasmap obligatorio
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} 
		return nombre.equals(other.nombre);
		
	}

}

////////////////////////////////

class Seguro{
	public String nombre;
	public int duracion;
	public float interes;
	
	public Seguro(String nombre, int duracion, float interes) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.interes = interes;
	}
	
	
}