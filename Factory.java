
import java.util.Scanner;
import static java.lang.System.*;

public class Factory {
	

	public Object FabricarObjeto(){
		Scanner implementacion = new Scanner(System.in);
		int tipoImp = 0;
		int validador = 0;
		Object Imp;
		Imp = new Object();
		while(validador <= 3){
		System.out.println("Seleccione el numero del tipo de clase a Implementar ");
		System.out.println("1. ArrayList	");
		System.out.println("2. Vector 		");
		System.out.println("3. Lista		");
		try{
			tipoImp = implementacion.nextInt();
			switch (tipoImp){
			case 1:
				StackArrayList Objeto = new StackArrayList();
				Objeto.mensaje();
				Imp = Objeto;
				validador = 4;
				break;
			case 2:
				StackVector Objeto1 = new StackVector();
				Objeto1.mensaje();
				Imp = Objeto1;
				validador = 4;
				break;
			case 3:
				StackAbstractList Objeto2 = new StackAbstractList();
				Objeto2.mensaje();
				Objeto2.getListas().FabricarLista();
				Imp = Objeto2;
				validador = 4;
				break;
			
			}
		}
		catch(Exception e){
			System.out.println("Seleccione una opcion coreccta");
			System.out.println("");
			implementacion.nextLine();
		}	
		
	}
		return Imp;

	}
}
