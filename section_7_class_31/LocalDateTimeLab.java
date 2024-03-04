package marcosoft.oca;

import java.time.*;


public class LocalDateTimeLab{

	public static void main(String[] args){

		LocalDate dateNow = LocalDate.now();
		LocalTime timeNow = LocalTime.now();
		LocalDateTime dateTimeNow = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("Current Date: " + dateNow);
		System.out.println("Current Time: " + timeNow);
		System.out.println("Current Date and Time: " + dateTimeNow);
		System.out.println("Current Date and Time da Zona: " + zonedDateTime);


		LocalDate myDate = LocalDate.of(1984,3,31);
		LocalTime myTime = LocalTime.of(7,15);
		LocalDateTime myDateTime = LocalDateTime.of(myDate,myTime);

		System.out.println("My Date: " + myDate);
		System.out.println("My Time: " + myTime);
		System.out.println("My Date and Time: " + myDateTime);


		myDate = myDate.plusYears(34);
		System.out.println("My Date (+34): " + myDate);

		myTime = myTime.plusMinutes(23);
		System.out.println("My Time (+23): " + myTime);


	}

}