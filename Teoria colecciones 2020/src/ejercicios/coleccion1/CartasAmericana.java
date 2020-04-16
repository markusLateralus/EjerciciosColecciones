package ejercicios.coleccion1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.ListIterator;

public class CartasAmericana {
	String[] escalera = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "paje", "reina", "rey" };
	Palo[] palos = { Palo.CORAZONES, Palo.PICAS, Palo.DIAMANTES, Palo.TREBOLES };

	ArrayList<String> baraja = new ArrayList<String>();

	public ArrayList<String> crearBaraja() {
		for (int i = 0; i < escalera.length; i++) {
			for (int j = 0; j < palos.length; j++) {
				baraja.add(escalera[i] + String.valueOf(palos[j]));
			}
		}
		return baraja;
	}

	public ArrayList<String> barajar() {
		Collections.shuffle(baraja);
		return baraja;
	}

	private ArrayList<String> repartir(int numeroCartasRepartir, int numeroJugadores) {

	
		ArrayList<String> manoDeCartas = new ArrayList<String>();
		List<String> jugador=null;
		
		do {
			int total = baraja.size();
		
		for (ListIterator iterator = baraja.listIterator(); iterator.hasNext();) {
			String carta = (String) iterator.next();
			if (iterator.hasNext() == false) {
				jugador= baraja.subList(total - 5, total);	
				
				for (int i = 0; i <jugador.size(); i++) {				
			
					System.out.println("jugador " + numeroJugadores + " "  + jugador.get(i));			
				}

			}
		
		}
		int t=manoDeCartas.size();
				if(manoDeCartas.isEmpty()) {
					manoDeCartas.addAll(jugador);
					
				}
		
				
				else {
					
					manoDeCartas.addAll(t, jugador);
				
				}
				
				
				System.out.println("cambio jugador");			
			    baraja.removeAll(manoDeCartas);
	

		numeroJugadores--;
		}while(numeroJugadores>0);
		System.out.println("fin de reparto");
		return manoDeCartas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartasAmericana repartidor = new CartasAmericana();
		ArrayList<String> baraja = repartidor.crearBaraja();
		repartidor.barajar();
		int numeroCartasArepartir=5;
		int numeroJugadores=3;
		ArrayList<String> mano = repartidor.repartir(numeroCartasArepartir,numeroJugadores);

	
	}

}

enum Palo {
	CORAZONES, PICAS, DIAMANTES, TREBOLES;
}