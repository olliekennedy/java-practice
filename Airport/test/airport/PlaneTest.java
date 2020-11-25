package airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    @Test
    public void create() {
        Plane plane = new Plane("Planey");
        assertEquals("Planey", plane.getName());
    }

}