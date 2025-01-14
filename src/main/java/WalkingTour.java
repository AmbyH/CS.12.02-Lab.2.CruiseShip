public class WalkingTour extends Activity {
    private double distance;
    public WalkingTour(String name, String description, double cost, int capacity, double distance) {
        super(name, description, cost, capacity);
        this.distance = distance;
    }
    //Returns the distance of the walking tour.
    public double getDistance() {
        return distance;
    }
    //Sets the distance of the walking tour.
    public void setDistance(double distance) {
        this.distance = distance;
    }
    @Override
    public String toString() {
        return super.toString() + "\nDistance: " + distance;
    }
}
