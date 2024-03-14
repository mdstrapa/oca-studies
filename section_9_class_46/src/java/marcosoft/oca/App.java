package marcosoft.oca;

public class App{
	public static void main(String... args){
		Airplane myAirplane = new Airplane();
		B737 myB737 = new B737();
		B747 myB747 = new B747();



		myAirplane.takeof();
		myB737.takeof();
		myB747.takeof();


		System.out.println("I don't know what is going to happen");

		Airplane anotherB737 = new B737();
		anotherB737.takeof();
		//if(anotherB737.hasMCAS) System.out.println("yes this airplane has MCAS");

		//B737 anotherAirplane = new Airplane();
		//if(anotherAirplane.hasMCAS) System.out.println("yes this airplane has MCAS");
	}
}