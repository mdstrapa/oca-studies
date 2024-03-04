package marcosoft.oca;

import java.util.Arrays;
import java.util.List;

public class ArrayLab{
	public static void main(String[] args){


		String[] myArray = args;

		System.out.println("The parameters you set are: ");
		System.out.println(Arrays.toString(myArray));


		System.out.println();
		System.out.println("Now I sorted the parameters");
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

		// -----------------------------------------

		System.out.println();
		System.out.println("Now I have an array of integers");
		Integer[] myNumbers = {67,3,7,12,89};
		for(Integer num:myNumbers){
			System.out.println("-> " + num);
		}

		Arrays.sort(myNumbers);

		System.out.println("The position of element 12 is: " + Arrays.binarySearch(myNumbers,12));

		// -----------------------------------------

		System.out.println();
		System.out.println("Now I have an array that was turned into a list");
		List<Integer> myIntList = Arrays.asList(myNumbers);
		for(Integer num:myIntList){
			System.out.println("-> " + num);	
		}

		// -----------------------------------------

		System.out.println();
		System.out.println("Playing with array elements");


		String[] names = new String[]{"Paulo","Ramiro","Juarez","Fabrício"};

		System.out.println("The second element of 'names' is: " + names[1]);




	}
}