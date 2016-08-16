import java.util.Iterator;

/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 24/07/2016
 * @file SinglyLinkedList.java
 * Implementa una lista enlazada
 * 
 */
public class SinglyLinkedList<E> extends List<E>
{
	
	private Node<E> head; // ref. to first element

	/**
 	 * Constructor: crea lista vacía 
 	 * @param ninguno
 	 */
	public SinglyLinkedList()
	// post: generates an empty list
	{
		head = null;
		count = 0;
	}

	/**
 	 * Este metodo vacía la lista
 	 * @param ninguno
 	 * @return no regresa nada
 	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head= null;
		count=0;
	}

	/**
 	 * Este metodo añade un elemento al final de la lista
 	 * @param value: contenido del elemento a añadir
 	 * @return no regresa nada
 	 */
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(value, null); //creates the new node
		if (head != null){
			Node<E> finger = head;
			while (finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(newNode);
		}
		else
			head = newNode;
		count++;
	}
	
	/**
 	 * Este metodo elimina y retorna el ultimo elemento de la lista
 	 * @param ninguno
 	 * @return contenido del elemento eliminado
 	 */
	@Override
	public E remove() {
		
		Node<E> finger = head;
		Node<E> prev = null;
		while (finger.next() != null)
		{
			prev= finger;
			finger= finger.next();
		}
		if (prev == null)
		{
			head= null;
		}
		else
		{
			prev.setNext(null);
		}
		count --;
		return finger.value();
	}

}
