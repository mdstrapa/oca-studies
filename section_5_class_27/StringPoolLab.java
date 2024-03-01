package marcosoft.oca;

public class StringPoolLab{

	public static void main(String[] args){

		String str1 = "Marcos Daniel";
		String str2 = "Marcos Daniel";
		String str3 = "Marcos" + " " + "Daniel";
		String str4 = "    Marcos Daniel    ".trim();
		String str5 = "    Marcos Daniel    ".trim().intern();


		System.out.println("The first test must me true:");
		System.out.println(str1 == str2);
		System.out.println("The second test also must be true:");
		System.out.println(str1 == str3);
		System.out.println("The third test must be false:");
		System.out.println(str1 == str4);
		System.out.println("The fourth test also must be true:");
		System.out.println(str1 == str5);
		System.out.println("The fifth test must be true:");
		System.out.println(str1.equals(str3));

	}

}