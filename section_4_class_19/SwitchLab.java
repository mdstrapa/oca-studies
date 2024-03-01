package marcosoft.oca;


public class SwitchLab{

	public static void main(String[] args){

		short myVar = 5;


		System.out.println("The 'Correct' Switch: ");

		switch(myVar){
			case 1:
				System.out.println("The number is 1");
				break;
			case 2:
				System.out.println("The number is 2");
				break;
			case 5:
				System.out.println("The number is 5");
				break;
			default:
				System.out.println("The number is different");
				break;
		}


		System.out.println("The Switch without breaks: ");

		switch(myVar){
			case 1:
				System.out.println("The number is 1");
			case 2:
				System.out.println("The number is 2");
			case 5:
				System.out.println("The number is 5");
			default:
				System.out.println("The number is different");
		}


		System.out.println("The 'Incorrect' Switch: ");

		switch(myVar){
			case 1:
				System.out.println("The number is 1");
			default:
				System.out.println("The number is different");
			case 5:
				System.out.println("The number is 5");
			case 2:
				System.out.println("The number is 2");
			
		}

	}

}