
/**
*CircularList, Lista circular
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/
public class CircularList<E> extends List<E> {
	
	private Node<E> tail;
	
	/**
 	 * Constructor
 	 * @param ninguno
 	 */
	public CircularList()
	{
		tail= null;
		count=0;
	}
	
	/**
 	 * Este metodo añade un elemento al incio de la lista
 	 * @param value: contenido del elemento
 	 * @return no regresa nada
 	 */
	public void addFirst(E value)
	{
		Node<E> temp= new Node<E>(value);
		if (tail==null)
		{
			tail= temp;
			tail.setNext(tail);
		}
		else
		{
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}
	/**
 	 * Este metodo añade un elemento al final de la lista
 	 * @param value: contenido del elemento
 	 * @return no regresa nada
 	 */
	public void add(E value)
	{
		addFirst(value);
		tail=tail.next();
	}
	
	/**
 	 * Este metodo elimina y retorna el ultimo elemento de la lista
 	 * @param ninguno
 	 * @return contenido del elemento eliminado
 	 */
	public E remove()
	{
		Node<E> finger= tail;
		while(finger.next()!= tail)
		{
			finger= finger.next();
		}
		Node<E> temp= tail;
		if (finger==tail)
		{
			tail= null;
		}
		else
		{
			finger.setNext(tail.next());
			tail= finger;
		}
		count --;
		return temp.value();
	}

}
