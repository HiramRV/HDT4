
public class CircularList<E> extends List<E> {
	
	private Node<E> tail;
	
	public CircularList()
	{
		tail= null;
		count=0;
	}
	
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
	
	public void add(E value)
	{
		addFirst(value);
		tail=tail.next();
	}
	
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
