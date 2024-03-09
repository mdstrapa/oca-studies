package marcosoft.oca;

public class AnotherClass{

	void writeElement(short element){
		System.out.println("This element is short: " + element);
	}

	void writeElement(double element){
		System.out.println("This element is double: " + element);
	}


	void writeObject(CharSequence obj){
		System.out.println("This object is CharSequence: " + obj);
	}

	void writeObject(Object obj){
		System.out.println("This object is Object: " + obj);
	}

}