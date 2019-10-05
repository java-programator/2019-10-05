package pl.altkom.zad8_1;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("Samolot " + name + " startuje");
    }

    @Override
    public void land() {
        System.out.println("Samolot " + name + " ląduje");
    }

    @Override
    public void callAirControl() {
        System.out.println("Samolot " + name + " komunikuje się z wieżą");
    }

    @Override
    public double getFuelNeeds() {
        return 50;
    }

    @Override
    public double getDistance() {
        return 100;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
