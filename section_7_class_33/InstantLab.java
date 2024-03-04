package marcosoft.oca;

import java.time.*;

public class InstantLab{
	public static void main(String[] args) throws InterruptedException{
		if(args[0].equals("Instant")) withInstant();
		else if(args[0].equals("LocalTime")) withLocalTime();
		else if(args[0].equals("LocalDateTime")) withLocalDateTime();
		else System.out.println("Wrong parameter :(");
	}

	static void withInstant() throws InterruptedException{
		System.out.println(Instant.now());

		Thread.sleep(3000);

		System.out.println(Instant.now());
	}

	static void withLocalTime() throws InterruptedException{
		System.out.println(LocalTime.now());

		Thread.sleep(3000);

		System.out.println(LocalTime.now());
	}

	static void withLocalDateTime() throws InterruptedException{
		System.out.println(LocalDateTime.now());

		Thread.sleep(3000);

		System.out.println(LocalDateTime.now());
	}

}