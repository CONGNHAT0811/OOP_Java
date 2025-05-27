package Chuong5.Person;
import java.util.Scanner;

public class Person {
    private String FullName;
    private int Age;


    public String getFullName() {
        return FullName;
    }
    public String setFullName(  String fullName) {
        return FullName = fullName;
    }
    public int getAge() {
        return Age;
    }
    public int setAge(int age) {
        return Age = age;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    public void displayData() {
        System.out.println("Ho ten: " + FullName);
        System.out.println("Tuoi: " + Age);
    }
}
