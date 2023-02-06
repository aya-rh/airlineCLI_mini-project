package Class;

import java.util.ArrayList;

public class Flight {

    String destination;
    int flightId;
    ArrayList<Passenger> passengers;

    public Flight (String destination) {
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.flightId = flightid; // we need to add the flight number generator here
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }




}