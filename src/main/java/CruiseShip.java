import java.util.ArrayList;

public class CruiseShip {
    private String name;
    private int passengerCapacity;
    private ArrayList<Destination> itinerary;
    private ArrayList<Passenger> passengers;
    //Creates a new cruise ship with the given name and passenger capacity. The itinerary
    //and list of passengers are empty.
    public CruiseShip(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<Destination>();
        this.passengers = new ArrayList<Passenger>();
    }
    //Returns the name of the cruise ship.
    public String getName() {
        return name;
    }
    //Returns the passenger capacity for the cruise ship.
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    //Returns the itinerary for the cruise ship.
    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }
    //Returns the list of passengers on the cruise ship.
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    //Sets the name of the cruise ship.
    public void setName(String name) {
        this.name = name;
    }
    //Sets the passenger capacity for the cruise ship.
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    //Sets the itinerary for the cruise ship.
    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }
    //Sets the list of passengers on the cruise ship.
    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    //Adds a destination to the cruise ship.
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }
    //Adds a passenger to the cruise ship.
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
    //Removes a destination from the cruise ship.
    public void removeDestination(Destination destination) {
        itinerary.remove(destination);
    }
    //Removes a passenger from the cruise ship.
    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }
    //Prints the itinerary for the cruise ship.
    public void printItinerary() {
        System.out.println("The itinerary for cruise ship " + name + " is:");
        for (Destination destination : itinerary) {
            System.out.println(destination.toString());
        }
    }
    //Prints the names of passengers on the cruise ship.
    public void printPassengerList() {
        System.out.println("The passengers for cruise ship " + name + " are:");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }
    }
    /*Prints the details of an individual passenger, including their name, passenger number,
    balance (if applicable), and the list of each activity they are signed up for, including
    the destination the activity is taking place and the price the passenger paid.*/
    public void getInfoPassenger(Passenger passenger) {
        System.out.println(passenger.toString());
    }

    @Override
    public String toString() {
        return "Cruise ship " + name + "\n" +
                "Passengers: " + passengers + "/" + passengerCapacity + "\n" +
                "Passenger List: " + passengers.toString();
    }

}
