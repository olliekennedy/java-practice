package airport;

import java.util.ArrayList;

public class Airport {
    private static int airportCapacity;
    private static String airportName;

    public Airport(Integer capacity, String name) {
        airportCapacity = capacity;
        airportName = name;
    }

    static ArrayList<Plane> hangar = new ArrayList<>(airportCapacity);

    public static void land(Plane plane) {
        if (hangar.size() < airportCapacity) {
            hangar.add(plane);
        }
    }

    public static String takeoff(Plane plane) {
        hangar.remove(plane);
        return "I, " + plane.getName() + " have taken off.";
    }

    public static String getAirportName() {
        return airportName;
    }
}

