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


		System.out.println("Using the new -> syntax after Java 17:");

		switch (myVar) {
			case 1,2,5 -> System.out.println("The number is small");
			case 10,11,56 -> System.out.println("The number is big");
		}


		System.out.println("Switch exoression:");

		byte number = 17;

		var greeting = switch(number){
			case 1,2,5 -> "Good day!";
			case 12,17,18,19 -> {
				var str1 = "Hello";
				var str2 = "World";
				yield str1 + " " + str2;
			}
			default -> "Good night";
		};

		System.out.println("The greetings is " + greeting);

	}

}