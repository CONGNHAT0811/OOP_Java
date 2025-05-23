package Chuong4.Day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Lession1_Map {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Employee> hashmap2 = new HashMap<>();
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            emp.inputData();
            hashmap2.put(emp.getEmployeeID(), emp);
        }
        System.out.println("Danh sach nhan vien:");
        for (String key : hashmap2.keySet()) {
            Employee emp = hashmap2.get(key);
            emp.displayData();
        }

    }
}
