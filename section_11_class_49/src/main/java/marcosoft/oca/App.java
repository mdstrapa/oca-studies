interface Instrument {
	public void play();
}


class Guitar implements Instrument{
	public void play(){
		System.out.println("THE GUITAR ROCKS");
	}
}




interface People {
	public void scream();
}



interface Airplane {
	public void takeOff();
}

public class App {
	public static void main(String[] args){
		System.out.println("My program is working!");

		Guitar myGuitar = new Guitar();
		myGuitar.play();



		People myPeople = new People() {
			public void scream(){
				System.out.println("AAAAAAAAAAA");
			}
		};

		myPeople.scream();


		Airplane myAirplane = () -> System.out.println("Fly with meeeeee");

		myAirplane.takeOff();

	}
}