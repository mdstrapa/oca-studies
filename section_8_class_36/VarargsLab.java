public class VarargsLab{
	public static void main(String... args){

		String[] myFriends = {"Lucio","Lauro","Daniel","Roberto"};
		String[] people = new String[]{"Walkiria","Pamela"};
		String[] coworkers = new String[3];
		coworkers[0] = "Maria";
		coworkers[1] = "Daniela";
		coworkers[2] = "Camila";

		myMethod(1,"Carlos","Felipe", "Josué","Ramiro","Pedro Henrique");
		myMethod(1,myFriends);
		myMethod(1,people);
		myMethod(1,coworkers);
		myMethod(1, new String[]{"Paloma","Fernando","Paulo"});

	}


	static void myMethod(int nomeNumber,String... friends){
		System.out.println("NAMES OF THE PEOPLE:");
		for(String friend:friends){
			System.out.println("Hello my good friend " + friend);
		}
		System.out.println("--------------------");
	}
}
