package Chuong4.Day2;

import java.util.HashMap;
import java.util.Scanner;

public class ThucHanh5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> hashmap = new HashMap<>();
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.inputData(sc);
            hashmap.put(std.getStudentID(), std);
        }
        System.out.println("Danh sach nhan vien:");

    }
}
