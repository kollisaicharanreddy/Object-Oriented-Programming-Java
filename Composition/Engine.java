package Composition;

public class Engine {
    String engineNumber;
    int horsePower;
    public Engine(String engineNumber, int horsePower) {
        this.engineNumber = engineNumber;
        this.horsePower = horsePower;
    }
    public void displayEngineDetails() {
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Horse Power: " + horsePower);
    }
}
