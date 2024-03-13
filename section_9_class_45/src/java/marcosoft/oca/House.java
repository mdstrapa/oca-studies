package marcosoft.oca;

public class House extends Building{
	static{System.out.println("2 - executes once");}
	{System.out.println("5 - executes every new instance");}
	public House(){
		System.out.println("6 - executes every new instance");
	}
}