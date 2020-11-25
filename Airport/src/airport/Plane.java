package airport;

public class Plane {
    private static String planeName;

    public String getName() {
        return planeName;
    }

    public Plane(String name) {
        planeName = name;
    }


    public static String name() {
        return planeName;
    }
}
