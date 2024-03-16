package marcosoft.oca;

public class AirportService {

    Airplane airplane;

    public AirportService(Airplane airplane){
        this.airplane = airplane;
    }

    void parkAirplane(){
        System.out.println(airplane.name + " is parked in the airport");
    }

}
