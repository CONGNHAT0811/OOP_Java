package Chuong5.Student;
import Chuong5.Student.Student;
import java.util.Scanner;

public class Subject extends Student {
    private String SubjectName;
    private int Credits;

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        this.SubjectName = subjectName;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        this.Credits = credits;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten mon hoc: ");
        SubjectName = sc.nextLine();
        System.out.print("Nhap so tin chi: ");
        Credits = sc.nextInt();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Ten mon hoc: " + SubjectName);
        System.out.println("So tin chi: " + Credits);
    }
    
}
