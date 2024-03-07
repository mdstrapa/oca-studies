package instrument;

public class Guitar{

	String modelNo = "GT3434";
	protected String type = "Strato";
	public String brand = "Fender";
	private String serialNo = "FEN897867.989";


	protected void playTestSound(){
		System.out.println("BLEM");
	}

	public void playNote(String note){
		System.out.println("This is the note to play: " + note);
	}

}