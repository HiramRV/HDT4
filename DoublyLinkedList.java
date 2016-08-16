/**
*DoubleLinkedList, Lista que utiliza Nodos Dobles
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/
public class DoublyLinkedList<E> extends List<E> {
	
	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;
	
	/**
 	 * Constructor: crea lista vac�a 
 	 * @param ninguno
 	 */
	public DoublyLinkedList()
	{
		head= null;
		tail= null;
		count= 0;
	}
	
	/**
 	 * Este metodo vac�a la lista
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
 	 * Este metodo a�ade un elemento al final de la lista
 	 * @param value: contenido del elemento a a�adir
 	 * @return no regresa nada
 	 */
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		tail= new DoubleNode<E>(value,null,tail);
		if (head == null)
		{
			head= tail;
		}
		count++;
	}

	/**
 	 * Este metodo elimina y retorna el ultimo elemento de la lista
 	 * @param ninguno
 	 * @return contenido del elemento eliminado
 	 */
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp= tail;
		tail= tail.previous();
		if (tail == null)
		{
			head=null;
		}
		else
		{
			tail.setNext(null); 
		}
		count--;
		return temp.value();
	}

}
