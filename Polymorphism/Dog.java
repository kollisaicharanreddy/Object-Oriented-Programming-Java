package Polymorphism;
public class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Woof Woof");
    }
}