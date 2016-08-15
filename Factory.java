
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
				StackList Objeto2 = new StackList();
				System.out.println("List");
				Imp = Objeto2.getListas().FabricarLista();
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
}
