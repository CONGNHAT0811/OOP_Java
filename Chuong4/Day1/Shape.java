package Chuong4.Day1;
import java.util.Scanner;

public class Shape {
    private String name;
    private double area;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape name: ");
        this.name = sc.nextLine();
        System.out.println("Enter area: ");
        this.area = sc.nextDouble();
    }
    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + area);
    }

    
    
}
