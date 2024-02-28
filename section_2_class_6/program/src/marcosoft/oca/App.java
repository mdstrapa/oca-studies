package marcosoft.oca;

import marcosoft.oca.Guitar;

import marcosoft.oca.depen.SomeDependency;

import marcosoft.oca.depenjar.DepenJar;

public class App{
	public static void main(String[] args){
		System.out.println("Marcosoft Program");
		Guitar myGuitar = new Guitar();
		myGuitar.play();


		// dependency from another class
		SomeDependency myDependency = new SomeDependency();
		myDependency.doSomething();


		// dependency from jar file
		DepenJar myDepenJar = new DepenJar();
		int valueFromDependency = myDepenJar.getValue();
		System.out.println("The value that came from Jar dependency is " + valueFromDependency);

	}
}