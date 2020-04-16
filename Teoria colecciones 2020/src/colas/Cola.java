package colas;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class Cola implements Deque{



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean offerFirst(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		/*
		 * cosas interesantes de la cola
		 * 
		 * offer (solo o con los sufijos First o Last) para añadir al frente
		 * poll	 (solo o con los sufijos First o Last) para extraer al frente
		 * peek (solo o con los sufijos First o Last) para leer del frente sin extraer 
		 * */
		
		//se puede pedir elementos PRIORITARIOS
		String palabras[]= {"primero", "segundo", "tercero", "cuarto"};	
		ArrayDeque <String> colaPalabras=new ArrayDeque<String>();	
		//meter un arreglo dentro de una cola
		for (int i = 0; i < palabras.length; i++) {
			colaPalabras.offer(palabras[i]);
		}		
		System.out.println(colaPalabras); //[primero, segundo, tercero, cuarto]
		
		
		//podemos DESENCOLAR, quitar el principio de la cola
		while(!colaPalabras.isEmpty()) {
			colaPalabras.poll();
			System.out.println(colaPalabras);
			/*
			 *  [primero, segundo, tercero, cuarto]
                [segundo, tercero, cuarto]
                [tercero, cuarto]
                [cuarto]
                []
			 */
		}
		
		//agregar en la primera posicion
		colaPalabras.addFirst("me pongo primero");
		System.out.println(colaPalabras);
		
		//eliminar el ultimo
		colaPalabras.pollLast();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
