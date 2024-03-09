package marcosoft.oca;

public class OverloadLab{
	public static void main(String... args){
		System.out.println("Overload Lab");

		System.out.println();


		AnotherClass another = new AnotherClass();

		byte elementOne = 1;
		int elementTwo = 32;
		float elementThree = 3.6f;

		another.writeElement(elementOne);
		another.writeElement(elementTwo);
		another.writeElement(elementThree);


		String objOne = new String("This is a STRING");
		WrittableObj objTwo = new WrittableObj();

		another.writeObject(objOne);
		another.writeObject(objTwo);


	}
}