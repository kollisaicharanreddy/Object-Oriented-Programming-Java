package Inheritance;

public class Student extends Person{
    private String course;

    Student(int id, String name, String course){
        super(id, name);
        this.course = course;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}
