interface Vehicle {
    void start();
}

class Car2 implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car2();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
