package Polymorphism;

public class Animal {
    private String name;
    Animal (String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
    
}
