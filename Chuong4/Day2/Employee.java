package Chuong4.Day2;  
import java.util.Scanner;

public class Employee {
    private String EmployeeID;
    private String FullName;


    public String getEmployeeID() {
        return EmployeeID;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        EmployeeID = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        FullName = sc.nextLine();
    }

    public void displayData() {
        System.out.println("Ma nhan vien: " + EmployeeID);
        System.out.println("Ho ten nhan vien: " + FullName);
    }



    
}
