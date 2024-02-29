public class MyVariableLab{

	public static void main(String[] args){

		int variable = declareMyVar(true);

		System.out.println("The value of the var is: " + variable);

	}


	static int declareMyVar(boolean isOk){

		int myVar;

		if(isOk) myVar = 2;
		else myVar = 10;

		return myVar;
	}

}