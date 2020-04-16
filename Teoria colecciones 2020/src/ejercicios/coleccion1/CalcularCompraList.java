package ejercicios.coleccion1;

import java.util.ArrayList;

public class CalcularCompraList {
/*
 * Escriba un programa que para un pedido dado calcule el importe por cada artículo y el
importe total del pedido. El pedido consta de una lista de artículos, cada uno con su
descripción (String), el número de unidades solicitadas y el precio de cada unidad. Se
recomienda utilizar la interfaz List para implementarlo.
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo medias= new Articulo("media",2,10);//precio unidades
		Articulo alfombra= new Articulo("alfombra",2,10);
		Articulo silla= new Articulo("silla",2,10);
		Articulo mesa= new Articulo("mesa",200,10);
		
		ArrayList <Articulo> articulos=new ArrayList<Articulo>();
		articulos.add(medias);
		articulos.add(alfombra);
		articulos.add(silla);
		articulos.add(mesa);
		
		Pedido pedido=new Pedido(articulos);
		
		double precioTotal=pedido.calcularPrecioTotal();
		System.out.println(precioTotal);
		
		double precioIndividual=pedido.calcularPrecioUnidad(mesa);
		System.out.println(precioIndividual);
	}

}

class Pedido{
	public ArrayList <Articulo> articulos;
	public double precioTotal;
	public Pedido(ArrayList<Articulo> articulos) {
		super();
		this.articulos = articulos;
	
	}
	
	
	public double calcularPrecioTotal() {
		
		double total=0;
		for (Articulo articulo : articulos) {
			total+=articulo.unidades *articulo.precio;
		}
		return total;
	}
	
	public double calcularPrecioUnidad(Articulo articulo) {
		double precio=0;
		for (Articulo  elemento: articulos) {
			if(elemento.nombre.equals(articulo.nombre)) {
				precio=elemento.precio;
			}
		}
		return precio;
	}
}


class Articulo{
	
	public String nombre;
	public double precio;
	public int unidades;
	
	public Articulo(String nombre, double precio, int unidades) {
		super();
		this.nombre=nombre;
		this.precio = precio;
		this.unidades = unidades;
	}

	@Override
	public String toString() {
		return "Articulo: " + nombre + ", precio=" + precio + ", unidades=" + unidades + "";
	}
	
	
	
}
