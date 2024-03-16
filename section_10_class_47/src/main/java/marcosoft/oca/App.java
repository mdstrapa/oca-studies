package marcosoft.oca;

public class App {

    public static void main(String[] args) {
        B737 b737_1 = new B737();
        A320 a320_1 = new A320();

        Integer s = 1;

        a320_1.name = "PTR0989";
        b737_1.name = "FRD23";

        b737_1.numberOfEngines = 2;
        a320_1.numberOfEngines = 2;

        b737_1.maxAltitude = 40000;

        //b737_1.takeoff();
        //a320_1.takeoff();

        Airplane airplane = new B737();
        //airplane.takeoff();

        AirportService airportServiceOne = new AirportService(a320_1);
        airportServiceOne.parkAirplane();
        AirportService airportServiceTwo = new AirportService(b737_1);
        airportServiceTwo.parkAirplane();



    }
}
