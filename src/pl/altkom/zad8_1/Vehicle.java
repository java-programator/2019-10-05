package pl.altkom.zad8_1;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public final double calculateFuelConsumption() {
        return getFuelNeeds() * getDistance();
    }

    public void go() {
        System.out.println(getClass().getSimpleName() + " o nazwie " + name + " jedzie");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " o nazwie " + name + " zatrzymuje się");
    }
}
