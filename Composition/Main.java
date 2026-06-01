package Composition;

public class Main {
    public static void main(String[] args){
        Engine e1 = new Engine("EN101", 120);
        Car c1 = new Car(e1, "Honda City");
        c1.displayCarDetails();
    }
    
}
