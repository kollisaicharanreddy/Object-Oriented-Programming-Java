package ClassAndObjects;
public class Students{
    private int studentId;
    private String name;
    private double marks;

    Students(int studentId, String name, double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    int getstudentId(){
        return studentId;
    }
    String getName(){
        return name;
    }
    double getMarks(){
        return marks;
    }
    void setstudentId(int studentId){
        this.studentId = studentId;
    }
    void setName(String name){
        this.name = name;
    }
    void setMarks(double marks){
        this.marks = marks;
    }
    void getStudentDetails(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    void calculateGrade(){
        if(marks >= 90){
            System.out.println("Grade: A");
        } else if(marks >= 75){
            System.out.println("Grade: B");
        } else if(marks >= 60){
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args){
        Students s1 = new Students(101, "Charan", 87.5);
        s1.getStudentDetails();
        s1.calculateGrade();
    }
}