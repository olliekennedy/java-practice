package airport;

import java.util.ArrayList;

public class Airport {
    private int airportCapacity;
    private final String airportName;

    public Airport(Integer capacity, String name) {
        airportCapacity = capacity;
        airportName = name;
    }

    ArrayList<Plane> hangar = new ArrayList<>(airportCapacity);

    public void land(Plane plane) {
        if (hangar.size() < airportCapacity) hangar.add(plane);
    }

    public String takeoff(Plane plane) {
        hangar.remove(plane);
        return "I, " + plane.getName() + " have taken off.";
    }

    public String getAirportName() {
        return airportName;
    }
}

