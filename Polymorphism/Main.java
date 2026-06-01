package Polymorphism;

public class Main {
    
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");
        Animal[] animals = new Animal[4];
        animals[0] = a1;
        animals[1] = a2;
        animals[2] = new Dog("Buddy");
        animals[3] = new Cat("Luna");
        for(Animal animal : animals){
           animal.makeSound();
        }

    }
}
