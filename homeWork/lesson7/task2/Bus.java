package Homework.lesson7.task2;

public class Bus extends GroundVehicle{

    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus(int pasagers, String route) {
        super(pasagers);
        this.route = route;
    }

    @Override
    public String toString() {
        return "\nThis is Bus" +
                " His route: " + route + '\'';
    }

    @Override
    public void drive() {
        System.out.println("Bus driving!");
    }
}
