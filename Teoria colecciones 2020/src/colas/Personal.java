package colas;

public class Personal {

	public String nombre;
	public int prioritario=0;
	public Personal() {
		// TODO Auto-generated constructor stub
	
	}
	public Personal(String nombre, int prioritario) {
		super();
		this.nombre = nombre;
		this.prioritario = prioritario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrioritario() {
		return prioritario;
	}
	public void setPrioritario(int prioritario) {
		this.prioritario = prioritario;
	}
	@Override
	public String toString() {
		return  nombre ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + prioritario;
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
		Personal other = (Personal) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (prioritario != other.prioritario)
			return false;
		return true;
	}
	
	
	
}
