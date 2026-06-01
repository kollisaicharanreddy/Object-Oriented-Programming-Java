public class Student {
    private int studentId;
    private String name;
    private double marks;

    Student(int studentId, String name, double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    int getStudentId(){
        return studentId;
    }
    String getName(){
        return name;
    }
    double getMarks(){
        return marks;
    }
    void setStudentId(int studentId){
        this.studentId = studentId;
    }
    void setName(String name){
        this.name = name;
    }
    void setMarks(double marks){
        this.marks = marks;
    }
    void displayDetails(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    String getGrade(){
        if(marks >= 90){
            return "A";
        } else if(marks >= 75){
            return "B";
        } else if(marks >= 60){
            return "C";
        } else {
            return "D";
        }
    }
    public static void main(String[] args){
        Student[] arr = new Student[5];

        arr[0] = new Student(101, "Charan", 87);
        arr[1] = new Student(102, "Ravi", 95);
        arr[2] = new Student(103, "Priya", 72);
        arr[3] = new Student(104, "Sneha", 58);
        arr[4]= new Student(105, "Arjun", 81);

        for(Student s : arr){
            s.displayDetails();
            System.out.println("Grade: " + s.getGrade());
            System.out.println();
        }
        double max = Double.MIN_VALUE;
        Student topStudent = null;
        for(Student s : arr){
            if(s.getMarks() > max){
                max = s.getMarks();
                topStudent = s;
            }
        }
        System.out.println("Topper: " + topStudent.getName());
        System.out.println("Marks: " + topStudent.getMarks());
        System.out.println();
        int sum = 0;
        float avg = 0;
        for(Student s:arr){
            sum += s.getMarks();
        }
        avg = (float)sum/arr.length;
        System.out.println("Average Marks: " + avg);
    }
}
