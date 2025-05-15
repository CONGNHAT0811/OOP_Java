package Chuong4.Day1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Students> arrlistStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Students std = new Students();
            std.InputStudent();
            arrlistStudent.add(std);
        }
        for(int i = 0; i < arrlistStudent.size(); i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ": ");
            arrlistStudent.get(i).DisplayStudent();
        }

        for(Students std : arrlistStudent) {
            System.out.println("Sinh vien: ");
            std.DisplayStudent();
        }
        Iterator<Students> iterator = arrlistStudent.iterator();
        while (iterator.hasNext()) {
            Students std = iterator.next();
            System.out.println("Sinh vien: ");
            std.DisplayStudent();
        }
        System.out.println("Nhập thứ tự sinh viên cần xóa ");
        int index = sc.nextInt();
        if (index >= 0 && index < arrlistStudent.size()) {
            arrlistStudent.remove(index);
            System.out.println("Danh sách sinh viên sau khi xóa: ");
            for (int i = 0; i < arrlistStudent.size(); i++) {
                System.out.println("Sinh vien thu " + (i + 1) + ": ");
                arrlistStudent.get(i).DisplayStudent();
            }
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
        

    }
}
