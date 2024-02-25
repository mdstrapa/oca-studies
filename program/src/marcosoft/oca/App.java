package marcosoft.oca;

import marcosoft.oca.Guitar;

import marcosoft.oca.depen.SomeDependency;

public class App{
	public static void main(String[] args){
		System.out.println("Marcosoft Program");

		Guitar myGuitar = new Guitar();

		myGuitar.play();

		SomeDependency myDependency = new SomeDependency();

		myDependency.doSomething();

	}
}