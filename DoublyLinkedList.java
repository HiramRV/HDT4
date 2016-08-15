
public class DoublyLinkedList<E> extends List<E> {
	
	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;
	
	public DoublyLinkedList()
	{
		head= null;
		tail= null;
		count= 0;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head= null;
		count=0;
	}

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
