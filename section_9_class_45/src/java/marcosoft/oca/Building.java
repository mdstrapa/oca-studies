package marcosoft.oca;

public class Building{
	static { System.out.println("1 - executes once");}
	{System.out.println("3 - executes every new instance");}
	public Building(){
		System.out.println("4 - executes every new instance");
	}
	static { System.out.println("1.1 - executes once");}

}