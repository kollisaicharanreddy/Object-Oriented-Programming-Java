package Abstraction;

public class Main {
    public static void main(String[] args){
        Employee fe1 = new FullTimeEmployee(1, "Charan", 50000);
        Employee pe1 = new PartTimeEmployee(2, "Ravi", 80, 300);
        fe1.displayInfo();
        System.out.println("Salary: " + fe1.calculateSalary());
        pe1.displayInfo();
        System.out.println("Salary: " + pe1.calculateSalary());
    }
    
}
