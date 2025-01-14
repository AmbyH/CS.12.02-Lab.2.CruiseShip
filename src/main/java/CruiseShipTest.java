import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CruiseShipTest {
    private CruiseShip cruiseShip;
    private Destination destination1, destination2;
    private Passenger passenger1, passenger2, passenger3, passenger4;
    private TheatreShow theatreShow;
    private VisitAttraction visitAttraction;
    private WalkingTour walkingTour;
    private Star star1, star2;
    private ArrayList<Star> stars;

    @BeforeEach
    void setUp() {
        cruiseShip = new CruiseShip("Titanic", 1000);
        destination1 = new Destination("Greece");
        destination2 = new Destination("Los Angeles");
        passenger1 = new Passenger("Theodore", 1, "Premium", 100, null);
        passenger2 = new Passenger("Andy", 2, "Senior", 100, null);
        passenger3 = new Passenger("King", 3, "Premium", 100, null);
        passenger4 = new Passenger("Bob", 4, "Standard", 50, null);
        theatreShow = new TheatreShow("The Wizard of Oz", "A magnificent play, following the tragic events of a hurricane.", 10, 100);
        visitAttraction = new VisitAttraction("Griffith Observatory", "A beautiful observatory with a view of the Hollywood sign.", 20, 50);
        walkingTour = new WalkingTour("Parthenon", "A tour of the ancient temple of Athena.", 30, 20, 1700);
        stars = new ArrayList<>();
        star1 = new Star("Rita", "Jessica");
        star2 = new Star("Tom", "Jefferey");
        stars.add(star1);
        stars.add(star2);
    }
    @AfterEach
    void tearDown() {
        cruiseShip = null;
        destination1 = null;
        destination2 = null;
        passenger1 = null;
        passenger2 = null;
        passenger3 = null;
        passenger4 = null;
        theatreShow = null;
        visitAttraction = null;
        walkingTour = null;
        star1 = null;
        star2 = null;
        stars = null;
    }
    @Test
    void testAddDestination() {
        cruiseShip.addDestination(destination1);
        cruiseShip.addDestination(destination2);
        ArrayList<Destination> expected = new ArrayList<>();
        expected.add(destination1);
        expected.add(destination2);
        assertEquals(expected, cruiseShip.getItinerary());
        cruiseShip.printItinerary();
    }
    @Test
    void testAddPassenger() {
        cruiseShip.addPassenger(passenger1);
        cruiseShip.addPassenger(passenger2);
        cruiseShip.addPassenger(passenger3);
        cruiseShip.addPassenger(passenger4);
        ArrayList<Passenger> expected = new ArrayList<>();
        expected.add(passenger1);
        expected.add(passenger2);
        expected.add(passenger3);
        expected.add(passenger4);
        assertEquals(expected, cruiseShip.getPassengers());
        cruiseShip.getInfoPassenger(passenger4);
    }
    @Test
    void testRemoveDestination() {
        cruiseShip.addDestination(destination1);
        cruiseShip.addDestination(destination2);
        cruiseShip.removeDestination(destination1);
        ArrayList<Destination> expected = new ArrayList<>();
        expected.add(destination2);
        assertEquals(expected, cruiseShip.getItinerary());
    }
    @Test
    void testRemovePassenger() {
        cruiseShip.addPassenger(passenger1);
        cruiseShip.addPassenger(passenger2);
        cruiseShip.addPassenger(passenger3);
        cruiseShip.addPassenger(passenger4);
        cruiseShip.removePassenger(passenger1);
        ArrayList<Passenger> expected = new ArrayList<>();
        expected.add(passenger2);
        expected.add(passenger3);
        expected.add(passenger4);
        assertEquals(expected, cruiseShip.getPassengers());
    }
    @Test
    void testGetAvailableActivities() {
        destination1.addActivity(theatreShow);
        destination1.addActivity(visitAttraction);
        destination1.addActivity(walkingTour);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(theatreShow);
        expected.add(visitAttraction);
        expected.add(walkingTour);
        assertEquals(expected, destination1.getAvailableActivities());
    }
    @Test
    void testGetActivity() {
        destination1.addActivity(theatreShow);
        destination1.addActivity(visitAttraction);
        destination1.addActivity(walkingTour);
        assertEquals(theatreShow, destination1.getActivity("The Wizard of Oz"));
        assertEquals(visitAttraction, destination1.getActivity("Griffith Observatory"));
        assertEquals(walkingTour, destination1.getActivity("Parthenon"));
    }
    @Test
    void testAddActivity() {
        destination1.addActivity(theatreShow);
        destination1.addActivity(visitAttraction);
        destination1.addActivity(walkingTour);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(theatreShow);
        expected.add(visitAttraction);
        expected.add(walkingTour);
        assertEquals(expected, destination1.getActivities());
    }
    @Test
    void testRemoveActivity() {
        destination1.addActivity(theatreShow);
        destination1.addActivity(visitAttraction);
        destination1.addActivity(walkingTour);
        destination1.removeActivity(theatreShow);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(visitAttraction);
        expected.add(walkingTour);
        assertEquals(expected, destination1.getActivities());
    }
    @Test
    void testTheatreShow() {
        theatreShow.signUp(passenger1);
        theatreShow.signUp(passenger2);
        theatreShow.signUp(passenger3);
        theatreShow.signUp(passenger4);
        ArrayList<Passenger> expected = new ArrayList<>();
        expected.add(passenger1);
        expected.add(passenger2);
        expected.add(passenger3);
        expected.add(passenger4);
        assertEquals(expected, theatreShow.getSignedUpPassengers());
    }
    @Test
    void testVisitAttraction() {
        visitAttraction.signUp(passenger1);
        visitAttraction.signUp(passenger2);
        visitAttraction.signUp(passenger3);
        visitAttraction.signUp(passenger4);
        ArrayList<Passenger> expected = new ArrayList<>();
        expected.add(passenger1);
        expected.add(passenger2);
        expected.add(passenger3);
        expected.add(passenger4);
        assertEquals(expected, visitAttraction.getSignedUpPassengers());
    }
    @Test
    void testWalkingTour() {
        walkingTour.signUp(passenger1);
        walkingTour.signUp(passenger2);
        walkingTour.signUp(passenger3);
        ArrayList<Passenger> expected = new ArrayList<>();
        expected.add(passenger1);
        expected.add(passenger2);
        expected.add(passenger3);
        assertEquals(expected, walkingTour.getSignedUpPassengers());
    }
    @Test
    void testStar() {
        assertEquals("Rita", star1.getActorName());
        assertEquals("Jessica", star1.getCharacterName());
        assertEquals("Tom", star2.getActorName());
        assertEquals("Jefferey", star2.getCharacterName());
    }
    @Test
    void testCruiseShip() {
        assertEquals("Titanic", cruiseShip.getName());
        assertEquals(1000, cruiseShip.getPassengerCapacity());
    }
    @Test
    void testDestination() {
        assertEquals("Greece", destination1.getName());
        assertEquals("Los Angeles", destination2.getName());
    }
    @Test
    void testPassenger() {
        assertEquals("Theodore", passenger1.getName());
        assertEquals(1, passenger1.getPassengerNumber());
        assertEquals("Premium", passenger1.getType());
        assertEquals(100, passenger1.getBalance());
    }
    @Test
    void testActivity() {
        assertEquals("The Wizard of Oz", theatreShow.getName());
        assertEquals("A magnificent play, following the tragic events of a hurricane.", theatreShow.getDescription());
        assertEquals(10, theatreShow.getCost());
        assertEquals(100, theatreShow.getCapacity());
        assertEquals(0, theatreShow.getSignUps());
    }
    @Test
    void testStarList() {
        ArrayList<Star> expected = new ArrayList<>();
        expected.add(star1);
        expected.add(star2);
        assertEquals(expected, stars);
    }
    @Test
    void testNoBalance() {
        passenger2.setBalance(0);
        theatreShow.signUp(passenger2);
        ArrayList<Passenger> expected = new ArrayList<>();
        assertEquals(expected, theatreShow.getSignedUpPassengers());
    }
    @Test
    void testSeniorDiscount() {
        theatreShow.signUp(passenger2);
        assertEquals(91, passenger2.getBalance());
    }
}
