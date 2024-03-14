package marcosoft.oca;

public class B737 extends Airplane{
	public int numOfEngines = 2;

	public boolean hasMCAS = true;

	@Override
	public void takeof(){
		System.out.println("The Boing 737 is on the air");
	}
}