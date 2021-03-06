/**
*List, clase encargada de crear un objeto del tipo de implementacion de lista a realizar
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/
import java.util.Scanner;
import static java.lang.System.*;
 
public abstract class List<E> implements IList<E> {

	protected int count; // list size
	
	@Override
	/**
 	 * Metodo para obtener la cantidad de elementos en la lista
 	 * @param no necesita
 	 * @return int, la cantidad de objetos en la lista
 	 */
	public int size() {
		return count;
	}

	@Override
	/**
 	 * Metodo para saber si una lista esta vacia o no
 	 * @param no necesita
 	 * @return boolean, true si la lista esta vacia, false si no lo esta
 	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
