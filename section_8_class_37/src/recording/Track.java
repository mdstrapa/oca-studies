package recording;

import instrument.Manufactor;
import instrument.Guitar;
import instrument.type.*;

public class Track{

	public static void main(String... args){
		
		// this must work since the Manufactor class is in the same package as Guitar it can be access any 
		// variable with the default access modifier
		Manufactor myManufactor = new Manufactor();
		myManufactor.showModelNo();


		// this must work since Stratocaster is a child class of Guitar so it can access any
		// variable with the protected access modifier
		Stratocaster myStrato = new Stratocaster();
		myStrato.showType();


		// this should not work because modelNo and type don't allow access from this class
		//Guitar myGuitar = new Guitar();
		//System.out.println("This is the guitar model: " + myGuitar.modelNo);
		//System.out.println("This is the guitar tyoe: " + myGuitar.type);

		// and IN FACT this doesn't compile

	}

}