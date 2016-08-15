import java.util.Scanner;

public class StackList extends Stack{
	

private List<Object> vector1;
private Factory factory= new Factory();
	
	public StackList(){
		vector1= factory.FabricarLista();
		vector1.add(0);
		
	}
	
	 /**
	 * Este metodo se utiliza para obtener la cantidad de elementos que hay en la pila
	 * @param no necesita
	 * @return el tamaño de la pila
	 */
	public int size(){
		return vector1.size();
		
	}
 	/**
 	 * Este metodo se utilizara para ingresar objetos a la pila
 	 * @param t Este sera el objeto que se ingresara a la pila
 	 * @return no regresa nada
 	 */

	public void push(Object t){
			vector1.add(t);
	}
	
	/**
	 * Este metodo se utilizara para obtener el ultimo objeto almacenado en la pila y eliminarlo 
	 * @param no necesita
	 * @return Object Regresa el ultimo objeto almacenado en la pila
	 */
	public Object pop() {
		return vector1.remove();
	}

	/**
	 * Este metodo se utiliza para verificar si el vector esta vacio o no 
	 * @param no necesita
	 * @return boolean Regresa un true o false dependiendo si esl vector esta vacio o no
	 */
	public boolean isEmpty() {
		return vector1.isEmpty();
	}


	/**
	 * Metodo get, sirve para obtener acceso a un atributo
	 * @param no recibe
	 * @return Regressa un valor especifico, en este caso null 
	 */
	public Object get() {
		return vector1.remove();
		}

	}
	

	
