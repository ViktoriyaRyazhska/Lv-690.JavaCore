package HW6_OOP2;

public class Bus extends GroundVehicle implements Vehicle{

    private String rout;

    public Bus(int passengers, String rout) {
        super(passengers);
        this.rout = rout;
    }

    @Override
    public void drive() {
        System.out.println("Let's start, "+getRout()+"! On the board: "+getPassengers());
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }
}
