package pl.altkom.zad8_1;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicles[] = new Vehicle[5];
        vehicles[0] = new Car("Żuk");
        vehicles[1] = new Truck("Kama3");
        vehicles[2] = new RaceCar("Ferrari");
        vehicles[3] = new Ship("Batory");
        vehicles[4] = new Plane("JumboJet");

        for (Vehicle v : vehicles) {
            v.go();
        }

        Vehicle v = new RaceCar("Maluch");
        v = new Plane("kukuruźnik");
        if (v instanceof Car) {
            Car c = (Car) v;
        } else {
            System.out.println("Jesteś GUPI, nie wolno tak");
        }
    }
}
