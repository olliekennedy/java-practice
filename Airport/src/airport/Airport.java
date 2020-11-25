package airport;

import java.util.ArrayList;

public class Airport {

    static ArrayList hangar = new ArrayList(1);

    public static void land(Plane plane) {
        hangar.add(plane);
    }


    public static String takeoff(Plane plane) {
        hangar.remove(plane);
        return "I, " + plane.getName() + " have taken off.";
    }
}

