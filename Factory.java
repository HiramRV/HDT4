
import java.util.Scanner;
import static java.lang.System.*;

public class Factory {
	

	public Stack FabricarObjeto(){
		Scanner implementacion = new Scanner(System.in);
		int tipoImp = 0;
		int validador = 0;
		Object Imp;
		Imp = new Object();
		while(validador <= 3){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Seleccione el numero del tipo de clase a Implementar ");
		System.out.println("1. ArrayList	");
		System.out.println("2. Vector 		");
		System.out.println("3. Lista		");
		try{
			tipoImp = implementacion.nextInt();
			switch (tipoImp){
			case 1:
				System.out.println("ArrayList");
				StackArrayList Objeto = new StackArrayList();
				Imp = Objeto;
				validador = 4;
				break;
			case 2:
				StackVector Objeto1 = new StackVector();
				System.out.println("Vector");
				Imp = Objeto1;
				validador = 4;
				break;
			case 3:
				System.out.println("List");
				StackList Objeto2= new StackList();
				Imp = Objeto2;
				validador = 4;
				break;
			
			}
		}
		catch(Exception e){
			System.out.println("Seleccione una opcion correcta");
			System.out.println("");
			implementacion.nextLine();
		}	
		
	}
		return (Stack) Imp;

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
}
}
