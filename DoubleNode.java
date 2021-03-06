/**
*DoubleNode, Nodo dos referencias
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/
public class DoubleNode<E> extends Node<E>{

	private E data;
	private DoubleNode<E> nextElement;
	private DoubleNode<E> prevElement;
	
	
	/**
 	 * Constructor con parametros
 	 * @param v, objeto a almacenar en el nodo. Next, nodo siguiente a este Nodo. Prev, nodo anterior a este nodo
 	 * @return Objeto tipo DoubleNode
 	 */
	public DoubleNode(E v, DoubleNode<E> next, DoubleNode<E> prev)
	{
		super(v,next);
		/*data= v;
		nextElement= next;*/
		if(nextElement != null)
		{
			nextElement.prevElement= this;
		}
		prevElement= prev;
		if(prevElement != null)
		{
			prevElement.nextElement= this;
		}
	}
	/**
 	 * Constructor Sin parametros
 	 * @param no necesita
 	 * @return Objeto tipo DoubleNode
 	 */
	public DoubleNode(E v)
	{
		this(v,null,null);
	}
	
	public void setPrev(DoubleNode<E> prev)
	// post: sets reference to new next value
	{
	    prevElement= prev;
	}
	
    public DoubleNode<E> previous()
    // post: returns reference to next value in list
	{
	    return prevElement;
	}
    public DoubleNode<E> next()
    // post: returns reference to next value in list
    {
       return nextElement;
    }

    public void setNext(DoubleNode<E> next)
    // post: sets reference to new next value
    {
       nextElement = next;
    }
}
