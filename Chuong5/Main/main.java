package Chuong5.Main;
import Chuong5.Student.Score;
import Chuong5.Student.Student;
import java.util.Scanner;
import java.util.HashMap;


public class main {
    public static void main(String[] args) {
        HashMap<String, Score> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the newline character from the buffer
        for (int i = 0; i < n; i++) {
            Score std = new Score();
            std.inputData();
            students.put(std.getStudentID(), std);
        }
        for (String key : students.keySet()) {
            Student std = students.get(key);
            std.displayData();
        }
    }
    
}
