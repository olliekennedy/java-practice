package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    @Test
    public void land() {
        Airport heathrow = new Airport(1, "Heathrow");
        Plane plane = new Plane("Planey");
        heathrow.land(plane);
        assertEquals(1, Airport.hangar.size());
        assertEquals(plane, Airport.hangar.get(0));
    }
    @Test
    public void planeTakesOffAndConfirmsItIsNoLongerAtTheAirport() {
        Plane plane = new Plane("Planey");
        Airport.land(plane);
        assertEquals("I, " + plane.getName() + " have taken off.", Airport.takeoff(plane));
        assertTrue(Airport.hangar.isEmpty());
    }
    @Test
    public void preventLandingAirportFull() {
        Plane plane1 = new Plane("Plane1");
        Airport.land(plane1);
        Plane plane2 = new Plane("Plane2");
        Airport.land(plane2);
        assertFalse(Airport.hangar.contains(plane2));
    }
    @Test
    public void preventLandingAirportFullWith2Capacity() {
        Airport heathrow = new Airport(2, "Heathrow");
        Plane plane1 = new Plane("Plane1");
        Airport.land(plane1);
        Plane plane2 = new Plane("Plane2");
        Airport.land(plane2);
        Plane plane3 = new Plane("Plane3");
        Airport.land(plane3);
        assertFalse(Airport.hangar.contains(plane3));
    }
}