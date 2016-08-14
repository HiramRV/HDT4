
public class StackAbstractList extends Factory{

	private List Listas;
	
	public StackAbstractList(){
		this.Listas = new List();
	}
	public void mensaje(){
		System.out.println(" Lista ");
		}




	public List getListas() {
		return Listas;
	}




	public void setListas(List listas) {
		Listas = listas;
	}

}

