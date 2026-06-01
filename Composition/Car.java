package Composition;

public class Car {
    private final Engine engine;
    String carName;

    public Car(Engine engine, String carName) {
        this.engine = engine;
        this.carName = carName;
    }
    public void displayCarDetails() {
        System.out.println("Car Name: " + carName);
        engine.displayEngineDetails();
    }
}
