package Chuong3.Day2;

public class Employee {
    private String FullName;
    private int Age;
    private String Address;

    public Employee( String fullName, int age, String address) {
        this.FullName = fullName;
        this.Age = age;
        this.Address = address;
    }
    public String getEmployee() {
        return "FullName: " + FullName + ", Age: " + Age + ", Address: " + Address;
    }
    
}
