package Chuong4.Day2;
import java.util.HashMap;
import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        HashMap<String, Student> hashmap1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        // Nhập danh sách sinh viên
        while (true) {
            Student std = new Student();
            std.inputData(sc);
            if (std.getFullName().isEmpty()) {
                break;
            }
            hashmap1.put(std.getFullName(), std);
        }
        for(String key : hashmap1.keySet()) {
            Student std = hashmap1.get(key);
            std.displayData();
        }
        int count = 0;
        System.out.println("Danh Sach sinh vien thi lailai:");
        for (Student std : hashmap1.values()) {
            if (std.getScore() <= 5) {
                std.displayData();
                count++;
            }
        }
        System.out.println("Số sinh viên phải thi lại: " + count);

        // hiển thi sinh vien có diem cao nhat
        double maxScore = 0;
        String maxStudent = "";
        for (Student std : hashmap1.values()) {
            if (std.getScore() > maxScore) {
                maxScore = std.getScore();
                maxStudent = std.getFullName();
            }
        }
        System.out.println("Sinh viên co diem cao nhat: " + maxStudent);


        // tim kiem sinh vien theo ten và hiện thị thong tin
        System.out.println("Nhap ten sinh vien can tim: ");
        String searchName = sc.nextLine();
        if (hashmap1.containsKey(searchName)) {
            Student std = hashmap1.get(searchName);
            std.displayData();
        } else {
            System.out.println("Khong tim thay sinh vien co ten: " + searchName);
        }
    }
    
}
