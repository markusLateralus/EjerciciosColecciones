package ejercicios.coleccion1;

import java.util.Stack;

public class AveriguaPalindromos {

	/*
	 * Use la clase Stack<E> de Java para invertir una palabra. A partir de este programa
determine si una palabra es palíndromo (se lee igual de izquierda a derecha que de derecha
a izquierda: reconocer, rotor, somos,..)
	 * 
	 * 
	 * */
	
	public static boolean invertirPalabra() {
		String palabra="soros";
		Stack<Character>listado=new Stack<Character>(); //pila que mantiene el sistema LIFO
		
		for (int i = 0; i < palabra.length(); i++) {
			listado.push(palabra.charAt(i)); //push() apilar añade un elemento
		}
		
		boolean palindromo=true;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)!= listado.pop()) { //pop() es desapilar, quita el último elemento
				palindromo=false;
				return palindromo;
			}
		}
		return palindromo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(invertirPalabra());
	}

}
