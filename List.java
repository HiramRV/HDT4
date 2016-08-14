package hdt4;


import java.util.Scanner;
import static java.lang.System.*;

public class List {

		public Object FabricarLista(){
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
						SinglyLinkedList Objeto = new SinglyLinkedList();
						Lst = Objeto;
						System.out.println("SinglyLinkedList");
						validador2 = 4;
						break;
					case 2:
						CircularList Objeto1 = new CircularList();
						Lst = Objeto1;
						System.out.println("CircularList");
						validador2 = 4;
						break;
					case 3:
						DoublyLinkedList Objeto2 = new DoublyLinkedList();	
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
			
			
			
			return null;
		}
	
}
