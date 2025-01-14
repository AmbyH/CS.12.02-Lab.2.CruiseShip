import java.util.ArrayList;

public class Passenger {
    private String name;
    private int passengerNumber;
    private String type; //standard, senior, or premium
    private double balance;
    private ArrayList<Activity> activities;

    public Passenger(String name, int passengerNumber, String type, double balance, ArrayList<Activity> activities) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = balance;
        this.activities = activities;
    }
    //Returns the name of the passenger.
    public String getName() {
        return name;
    }
    //Returns the passenger number.
    public int getPassengerNumber() {
        return passengerNumber;
    }
    //Returns the type of the passenger.
    public String getType() {
        return type;
    }
    //Returns the balance of the passenger.
    public double getBalance() {
        return balance;
    }
    //Returns the list of activities for the passenger.
    public ArrayList<Activity> getActivities() {
        return activities;
    }
    //Sets the name of the passenger.
    public void setName(String name) {
        this.name = name;
    }
    //Sets the passenger number.
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    //Sets the type of the passenger.
    public void setType(String type) {
        this.type = type;
    }
    //Sets the balance of the passenger.
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Sets the list of activities for the passenger.
    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
    //Adds an activity to the list of activities for the passenger.
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    //Adds an amount to the balance of the passenger.
    public void addBalance(double amount) {
        balance += amount;
    }
    //Subtracts an amount from the balance of the passenger.
    public void subtractBalance(double amount) {
        balance -= amount;
    }
    //Returns a string representation of the passenger.
    @Override
    public String toString() {
        return name + ", ID " + passengerNumber + ", " + type + ", $" + balance + ", " + activities;
    }
}
