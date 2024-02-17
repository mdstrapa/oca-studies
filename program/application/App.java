package com.marcosoft.oca.program.application;

import com.marcosoft.oca.program.model.Guitar;

import marcosoft.dependency.Somedependency;

public class App{
	public static void main(String[] args){
		System.out.println("Marcosoft Program");

		Guitar myGuitar = new Guitar();

		myGuitar.play();

		Somedependency myDependency = new Somedependency();

		myDependency.doSomething();

	}
}