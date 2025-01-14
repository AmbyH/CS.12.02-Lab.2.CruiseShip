import java.util.ArrayList;

public class Destination {
    private String name;
    private ArrayList<Activity> activities;
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<Activity>();
    }
    //Returns the name of the destination.
    public String getName() {
        return name;
    }
    //Returns the list of activities at the destination.
    public ArrayList<Activity> getActivities() {
        return activities;
    }
    //Sets the name of the destination.
    public void setName(String name) {
        this.name = name;
    }
    //Sets the list of activities at the destination.
    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
    //Adds an activity to the destination.
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    //Removes an activity from the destination.
    public void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    //Returns the available activities from the destination.
    public ArrayList<Activity> getAvailableActivities() {
        ArrayList<Activity> availableActivities = new ArrayList<Activity>();
        for (Activity activity : activities) {
            if (activity.getSignUps() < activity.getCapacity()) {
                availableActivities.add(activity);
            }
        }
        return availableActivities;
    }
    //Returns the activity with the given name.
    public Activity getActivity(String name) {
        for (Activity activity : activities) {
            if (activity.getName().equals(name)) {
                return activity;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return name + " has the following activities: " + activities.toString();
    }
}
