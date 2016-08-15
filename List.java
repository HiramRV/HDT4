import java.util.Scanner;
import static java.lang.System.*;
 
public abstract class List<E> implements IList<E> {

	protected int count; // list size
	
	@Override
	public int size() {
		return count;
	}

	@Override
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

	public List<Object> FabricarLista(){
		 			Scanner Sc = new Scanner(System.in);
		 			int tipoLst = 0;
		 			int validador2 = 0;
		 			Object Lst = new Object();
		 			while(validador2 <= 3){
		 				System.out.println("Seleccione el numero del tipo de Lista a Implementar ");
		 				System.out.println("1. SinglyLinkedList	");
		 				System.out.println("2. CircularList 		");
		 				System.out.println("3. DoubleLinkedList		");
		 				try{
		 					tipoLst = Sc.nextInt();
		 					switch (tipoLst){
		 					case 1:
		 						SinglyLinkedList<Object> Objeto = new SinglyLinkedList<Object>();
		 	     				Lst = Objeto;
		 						System.out.println("SinglyLinkedList");
		 						validador2 = 4;
		 						break;
		 					case 2:
		 						CircularList<Object> Objeto1 = new CircularList<Object>();
		 						Lst = Objeto1;
		 						System.out.println("CircularList");
		 						validador2 = 4;
		 						break;
		 					case 3:
		 						DoublyLinkedList<Object> Objeto2 = new DoublyLinkedList<Object>();	
		 						Lst = Objeto2;
		 						System.out.println("DoubleLinkedList");
		 						validador2 = 4;
		 					break;
		 					
		 					}
		 				}
		 				catch(Exception e){
		 					System.out.println("Seleccione una opcion coreccta");
		 					System.out.println("");
		 					Sc.nextLine();
		 				}	
		 				
		 			}
		 			return (List<Object>) Lst;
	
}}