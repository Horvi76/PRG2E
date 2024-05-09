package oop.staticShowcase;

public class Student {
    int studentID;
    String name;
    static int studentsEnrolled = 0;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        studentsEnrolled++;
    }

    void getDetails(){
        System.out.println("Student: " + name);
        System.out.println("StudentID: " + studentID);
    }

    static int getStudents(){
        return studentsEnrolled;
    }

    public static void main(String[] args) {
        System.out.println("Studuje: " + Student.getStudents());
        Student st = new Student(13, "Frank");
        System.out.println("Studuje: " + Student.getStudents());
        Student an = new Student(15, "Anne");
        Student carl = new Student(4, "Carl");
        Student last = new Student(199, "Dave");
        System.out.println("Studuje: " + Student.getStudents());
    }
}
