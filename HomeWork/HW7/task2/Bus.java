package HW7.task2;


public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passangers, String route) {
        super(passangers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void drive() {
        System.out.println("Bus can drive");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' + " amount of passangers: " + getPassangers() +
                '}';
    }
}