package marcosoft.oca;

public class WhileLab{

	public static void main(String[] args) {
		var myNumber = 19;

		FIRST_LOOP: while(myNumber < 100){

			myNumber++;

			SECOND_LOOP: while(true){
				System.out.println("I am inside the second loop and the Number is " + myNumber);

				myNumber++;

				if(myNumber == 25) break FIRST_LOOP;
			}

			// indeed the compiler complais about this line
			//System.out.println("This is an unreacheble statement. It should cause an error to the compiler");
		}

		while(myNumber < 40){
			myNumber++;
			if(myNumber % 2 == 0) continue;
			System.out.println("This is an odd number: " + myNumber);
		}

	}
}