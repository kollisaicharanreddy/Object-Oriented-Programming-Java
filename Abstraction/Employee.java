package Abstraction;

abstract class Employee {
    private int id;
    private String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }  
    abstract double calculateSalary();
}
