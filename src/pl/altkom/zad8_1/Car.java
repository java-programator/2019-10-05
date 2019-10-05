package pl.altkom.zad8_1;

//   tak nie wolno
//         ||
public /*final*/ class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 5;
    }

    @Override
    public double getDistance() {
        return 100;
    }

    // tak nie wolno!
//    @Override
//    public double calculateFuelConsumption() {
//
//    }
}
