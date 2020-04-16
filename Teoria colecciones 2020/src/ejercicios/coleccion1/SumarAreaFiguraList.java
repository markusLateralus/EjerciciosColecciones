package ejercicios.coleccion1;

import java.util.ArrayList;

public class SumarAreaFiguraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Figura figura=new Figura();
		Rectangulo rectangulo=new Rectangulo(6,8);
		Triangulo triangulo=new Triangulo(4,5);
		Circulo circulo=new Circulo(12);
		
		Figura.lista.add(rectangulo);
		Figura.lista.add(triangulo);
		Figura.lista.add(circulo);
		
		double total=figura.calcularArea();
		System.out.println("total es: " + total);
	
	}

}

class Figura{
	
	public static ArrayList<Figura>lista =new ArrayList<Figura>();

	public double calcularArea() {
		// TODO Auto-generated method stub
		double total=0;
		for (int i = 0; i < lista.size(); i++) {
			total+=lista.get(i).calcularArea();
		}
		
		return total;
	}
	
	
}

class Circulo extends Figura{
	public double radio;
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	@Override
	public double calcularArea() {
		double area=Math.pow(this.radio, 2) * Math.PI ;
		return area;
	}
}

class Rectangulo extends Figura{
	public double base;
	public double altura;
	
	public Rectangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	
	@Override
	public double calcularArea() {
		double area=this.base*this.altura;
		return area;
	}
}

class Triangulo extends Figura{
	public double base;
	public double altura;
	
	public Triangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	@Override
	public double calcularArea() {
		double area= (this.base*this.altura)/2;
		return area;
	}
}


