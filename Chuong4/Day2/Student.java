package Chuong4.Day2;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String fullName;
    private double score;

    public void inputData(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        this.studentID = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.fullName = sc.nextLine().trim();
        if (!this.fullName.isEmpty()) {
            System.out.print("Nhap diem: ");
            this.score = Double.parseDouble(sc.nextLine());
        }
    }
    public String getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public double getScore() {
        return score;
    }

    public void displayData() {
        System.out.println("Ho ten: " + fullName + ", diem: " + score);
    }
    
}
