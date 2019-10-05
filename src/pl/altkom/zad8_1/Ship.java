package pl.altkom.zad8_1;

public class Ship extends Vehicle implements Sailing {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Łódka " + name + " przybija do portu");
    }

    @Override
    public double getFuelNeeds() {
        return 15;
    }

    @Override
    public double getDistance() {
        return 50;
    }

    @Override
    public void stop() {
        dock();
    }
}
