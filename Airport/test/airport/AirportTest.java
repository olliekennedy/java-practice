package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    @Test
    public void land() {
        Plane plane = new Plane("Planey");
        Airport.land(plane);
        assertEquals(1, Airport.hangar.size());
        assertEquals(plane, Airport.hangar.get(0));
    }

    public void takeoff() {
        Plane plane = new Plane("Planey");
        Airport.land(plane);
        assertEquals("I, " + plane.getName() + " have taken off.", Airport.takeoff(plane));
        assertTrue(Airport.hangar.isEmpty());
    }
}