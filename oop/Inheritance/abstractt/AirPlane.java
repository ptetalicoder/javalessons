package oop.Inheritance.abstractt;

public class AirPlane extends Vehicle implements Drivable, Flyable{
    public AirPlane(int gas) {
        super(gas);
    }

    @Override
    public void drive() {
        System.out.println("VROOM VROOM!");
    }

    @Override
    public void setCruiseControl() {

    }

    @Override
    public void setCruiseControl(int speed) {
        System.out.println("Taxi speed of " + speed + "MPH set.");

        }

    @Override
    public void fly() {
        System.out.println("Ladies and Gentlemen, fasten your seatbeats");
    }
}
