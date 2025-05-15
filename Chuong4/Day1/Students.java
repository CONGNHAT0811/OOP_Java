package Chuong4.Day1;
import java.util.Scanner;;

public class Students {
    private String FullName;
    private String StudentID;
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String fullName) {
        FullName = fullName;
    }
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.FullName = sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        this.StudentID = sc.nextLine();
    }

    public void DisplayStudent() {
        System.out.println("Ho ten: " + this.FullName);
        System.out.println("Ma sinh vien: " + this.StudentID);
    }
   

    
}
