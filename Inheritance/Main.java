package Inheritance;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Charan", "Java");
        Employee employee = new Employee(2, "Ravi", 50000.0);

        student.displayInfo();
        System.out.println();
        employee.displayInfo();
    }
}
