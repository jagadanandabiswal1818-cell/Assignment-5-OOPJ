interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started with a push button / key ignition.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started with a kick / self-start.");
    }
}

public class test16 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}