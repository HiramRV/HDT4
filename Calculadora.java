
/**
*Calculadora, Esta se encarga de realizar los calculos para mostar el resultado del .txt con las instrucciones
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-15
*/

import java.io.*;

public class Calculadora implements I_Calculadora{

	private Stack miPila;
	private String operaciones;
	private String string="";
	private Factory factory= new Factory();
	
	//Constructor
	public Calculadora(){
		this.miPila = factory.FabricarObjeto();
		//*this.operaciones = "2 2 + 3 * ";
		
	}
	
	
	/**
	 * Este metodo se encarga de leer un string e identidicar los numeros y operaciones, para hacer uso de la pila y retornar 
	 * el resultado de la operacion
	 * @param String Recibe el string de la instruccion a realizar
	 * @return int regresa el resutlado de la operaciones
	 */
	public int calcular(String vector) {
	
		for(int posicion=0;posicion<vector.length();posicion++)
		{
			String caracter=vector.substring(posicion,posicion+1);
			if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") ||caracter.equals("4") || caracter.equals("5") || caracter.equals("6") ||caracter.equals("7") || caracter.equals("8") || caracter.equals("9"))
					{
					int intcaracter = Integer.parseInt(caracter);
					miPila.push(intcaracter);
					//System.out.println("Numero"+intcaracter);
					}
				if (caracter.equals("*") )
					{
					int numero1= (int)miPila.pop();
					int numero2= (int)miPila.pop();
					int intresultado=(numero1*numero2);
					miPila.push(intresultado);
					string=string+"Multiplicación: "+numero2+"*"+numero1+"="+intresultado+"\n";
					//System.out.println(string);
					}
					
				if (caracter.equals("/") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero2/numero1);
					miPila.push(intresultado);
					string=string+"División: "+numero2+"/"+numero1+"="+intresultado+"\n";
					//System.out.println(string);
					}
				
				if (caracter.equals("+") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero1+numero2);
					miPila.push(intresultado);
					string=string+"Suma: "+numero2+"+"+numero1+"="+intresultado+"\n";
					//System.out.println(string);
					}
					
				if (caracter.equals("-") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero2-numero1);
					miPila.push(intresultado);
					string=string+"Resta: "+numero2+"-"+numero1+"="+intresultado+"\n";
					//System.out.println(string);
					}	
			
		}
		int resultado = (int)miPila.pop();
		return 	resultado;
		
	}

	/**
	 * Este metodo se encarga de leer un archivo de texto y almacenar en un string su contenido
	 * @param String, Recibe como parametro la direccion donde se encuentra el .txt con la operaciones a realizar
	 * @return String retorna el string que se encontraba en el .txt
	 */
	public String leerArchivo(String direccionx) {
		try {
			FileInputStream dirtxt;
			String path = new java.io.File(".").getCanonicalPath();
			path = path + "\\"+ direccionx;
			dirtxt = new FileInputStream(path);
			DataInputStream lineas = new DataInputStream(dirtxt);
			BufferedReader memoriabuf = new BufferedReader(new InputStreamReader(lineas));
			operaciones=memoriabuf.readLine();
			lineas.close();
		}catch(Exception e){
			System.err.println("Error Fatal");
			
		}
	
		return operaciones;
		
		
		// TODO Auto-generated method stub
		
	}
	/**
 	 * Metodo Get
 	 * @param No necesita
 	 * @return Objeto tipo miPila
 	 */
	public Stack getMiPila() {
		return miPila;
	}

	/**
 	 * Metodo Set
 	 * @param un objeto de tipo miPila
 	 * @return no aplica
 	 */
	public void setMiPila(Stack miPila) {
		this.miPila = miPila;
	}

	/**
 	 * Este metodo retorna las operaciones realizadas en la calculadora
 	 * @param No necesita
 	 * @return String con las operaciones realizadas por la calculadora
 	 */
	public String getOperaciones() {
		return operaciones;
	}

	/**
 	 * Este metodo establace las operaciones a realizar en la calculadora
 	 * @param String con las operaciones a realizar
 	 * @return no aplica
 	 */
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}

	/**
 	 * GetString
 	 * @param No necesita
 	 * @return String del atributo de la clase
 	 */
	public String getString() {
		return string;
	}

	/**
 	 *SetString 
 	 * @param El String que se guardara como atributo 
 	 * @return No necesita
 	 */
	public void setString(String string) {
		this.string = string;
	}

}
