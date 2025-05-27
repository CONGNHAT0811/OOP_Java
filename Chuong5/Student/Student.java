package Chuong5.Student;
import Chuong5.Person.Person;
import java.util.Scanner;

public class Student extends Person {
    private String StudentID;
    private String ClassName;
    
    public String getStudentID() {
        return StudentID;
    }    
    public String getClassName() {
        return ClassName;
    }
    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }
    public void setClassName(String className) {
        this.ClassName = className;
    }
    @Override
    public void inputData() {
        super.inputData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        StudentID = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        ClassName = sc.nextLine();
    }
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Ma sinh vien: " + StudentID);
        System.out.println("Ten lop: " + ClassName);
    }
    
}
