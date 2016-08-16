/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 24/07/2016
 * @file Node.java
 * Modela un elemento de una lista enlazada
 */
public class Node<E>
{
	 protected E data; // value stored in this element
	 protected Node<E> nextElement; // ref to next

	 /**
	  * Constructor1
	  * @param v: contenido del elemento
	  *        next: siguiente elemento, nodo al que se enlaza
	  * @return nada
	  */
	   public Node(E v, Node<E> next)
	   // pre: v is a value, next is a reference to 
	   //      remainder of list
	   // post: an element is constructed as the new 
	   //      head of list
	   {
	       data = v;
	       nextElement = next;
	   }

	   /**
		  * Constructor2, enlaza con null
		  * @param v: contenido del nodo
		  * @return nada
		  */
	   public Node(E v)
	   // post: constructs a new tail of a list with value v
	   {
	      this(v,null);
	   }

	   /**
		 * Metodo get, devuelve contenido
		 * @param no necesita
		 * @return data, contenido
		 */
   public E getData() {
		return data;
	}
   /**
	 * Metodo set, cambia data
	 * @param data: valor por el que se cambiara
	 * @return nada 
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * Metodo get, obtiene el siguiente nodo
	 * @param ninguno
	 * @return elemento siguiente
	 */
	public Node<E> getNextElement() {
		return nextElement;
	}
	/**
	 * Metodo set, setea el siguiente nodo
	 * @param nextElement: siguiente nodo
	 * @return nada
	 */
	public void setNextElement(Node<E> nextElement) {
		this.nextElement = nextElement;
	}

	/**
	 * Metodo que devuelve el nodo siguiente
	 * @param no necesita
	 * @return nodo siguiente
	 */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   /**
	 * Metodo que cambia el siguiente nodo
	 * @param next: nodo siguiente
	 * @return nada
	 */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }
   /**
	 * Metodo que retorna el contenido del nodo
	 * @param no necesita
	 * @return contenido del nodo
	 */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }
   /**
	 * Metodo que cambia contenido del nodo
	 * @param value: contenido
	 * @return nada
	 */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}