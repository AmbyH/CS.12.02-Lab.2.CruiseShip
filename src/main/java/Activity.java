import java.util.ArrayList;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int signUps;
    private ArrayList<Passenger> signedUpPassengers;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.signUps = 0;
        this.signedUpPassengers = new ArrayList<Passenger>();
    }
    //Returns the name of the activity.
    public String getName() {
        return name;
    }
    //Returns the description of the activity.
    public String getDescription() {
        return description;
    }
    //Returns the cost of the activity.
    public double getCost() {
        return cost;
    }
    //Returns the capacity of the activity.
    public int getCapacity() {
        return capacity;
    }
    //Returns the number of passengers signed up for the activity.
    public int getSignUps() {
        return signUps;
    }
    //Returns the list of passengers signed up for the activity.
    public ArrayList<Passenger> getSignedUpPassengers() {
        return signedUpPassengers;
    }
    //Sets the name of the activity.
    public void setName(String name) {
        this.name = name;
    }
    //Sets the description of the activity.
    public void setDescription(String description) {
        this.description = description;
    }
    //Sets the cost of the activity.
    public void setCost(double cost) {
        this.cost = cost;
    }
    //Sets the capacity of the activity.
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //Sets the number of passengers signed up for the activity.
    public void setSignUps(int signUps) {
        this.signUps = signUps;
    }
    //Sets the list of passengers signed up for the activity.
    public void setSignedUpPassengers(ArrayList<Passenger> signedUpPassengers) {
        this.signedUpPassengers = signedUpPassengers;
    }
    //Signs up a passenger to the activity
    public void signUp(Passenger passenger) {
        if (signUps < capacity) {
            if (passenger.getType().equals("Standard") && passenger.getBalance() >= cost) {
                passenger.setBalance(passenger.getBalance() - cost);
                addSignedUpPassenger(passenger);
            }
            else if (passenger.getType().equals("Senior") && passenger.getBalance() >= cost*0.9) {
                passenger.setBalance(passenger.getBalance() - cost*0.9);
                addSignedUpPassenger(passenger);
            }
            else if (passenger.getType().equals("Premium")) {
                addSignedUpPassenger(passenger);
            }
            else {
                System.out.println("Passenger does not have enough funds to sign up for this activity.");
            }
        }
        else {
            System.out.println("Activity is full.");
        }
    }
    //Adds a passenger to the list of passengers signed up for the activity.
    public void addSignedUpPassenger(Passenger passenger) {
        signedUpPassengers.add(passenger);
        signUps++;
    }
    //Removes a passenger from the list of passengers signed up for the activity.
    public void removeSignedUpPassenger(Passenger passenger) {
        if (signedUpPassengers.contains(passenger)) {
            signedUpPassengers.remove(passenger);
            signUps--;
            if (passenger.getType().equals("standard")) {
                passenger.setBalance(passenger.getBalance() + cost);
            }
            else if (passenger.getType().equals("senior")) {
                passenger.setBalance(passenger.getBalance() + cost*0.9);
            }
        }
        else {
            System.out.println("Passenger is not signed up for this activity.");
        }
    }
    //Returns a string representation of the activity.
    public String toString() {
        return name + ": " + description + " ($" + cost + ")";
    }
}
