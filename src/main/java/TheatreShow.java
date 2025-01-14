import java.util.ArrayList;

public class TheatreShow extends Activity {
    private ArrayList<Star> stars;
    public TheatreShow(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
        stars = new ArrayList<Star>();
    }
    //Returns the list of stars in the theatre show.
    public ArrayList<Star> getStars() {
        return stars;
    }
    //Sets the list of stars in the theatre show.
    public void setStars(ArrayList<Star> stars) {
        this.stars = stars;
    }
    //Adds a star to the list of stars in the theatre show.
    public void addStar(Star star) {
        stars.add(star);
    }
    //Removes a star from the list of stars in the theatre show.
    public void removeStar(Star star) {
        stars.remove(star);
    }
    @Override
    public String toString() {
        return super.toString() + "\nStars:" + stars.toString();
    }
}
