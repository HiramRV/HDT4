/**
*main-ejecuta el programa, utilizando la clase calculadora y sus respectivas interfaces e implementaciones
*@version: 3.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/



/**
 * libreria para solicitud de datos a usuario
 */ 
import java.util.Scanner;
/**
 * se declara la clase main
 */ 
public class main {
/**
 * se declara el main par ajecutar codigo en consola
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner usuario = new Scanner(System.in);
		String direccion;
		direccion="";
		System.out.println("\n      ###########################################################");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      #___ CALCULADORA__________________________________________#");
		System.out.println("      #__________________DESDE__________________________________#");
		System.out.println("      #__________________________ARCHIVOS_______________________#");
		System.out.println("      #____________________________________DE___________________#");
		System.out.println("      #_________________________________________TEXTO___________#");
		System.out.println("      #_________________________________________________TXT_____#");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      ###########################################################\n");
		
		/**
		 * ayuda a que no se produscan errores por parte del usuario
		 */
		try
		{
			System.out.println("Ingrese el nombre del archivo que contiene la operacion (incluir el .txt) ");
			direccion= usuario.next();
			
			
			Calculadora calculadoraPrubea = new Calculadora();
			//String direccion = "ejemplo.txt";
		
			String instrucciones = calculadoraPrubea.leerArchivo(direccion);
			System.out.println(" ");
			System.out.println(instrucciones);
			System.out.println(" ");
			int resultado = calculadoraPrubea.calcular(instrucciones);
			System.out.println(calculadoraPrubea.getString());
			System.out.println("El resultado de la operacion es : "+resultado);
		}
		/**
		 * catch responde a errores prudcidos en el try
		 */
		catch(Exception e)
		{
			System.out.println("no se encontro archivo solicitado/ \nno esta bien definida la operacion");
		}
	}
}
