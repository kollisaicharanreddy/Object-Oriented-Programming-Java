package Inheritance;

public class Employee extends Person {
    private double salary;
    Employee(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}
