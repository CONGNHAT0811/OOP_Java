package Chuong4.Day1;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;

public class LinkSet {
    public static void main(String[] args) {
        Set<Students> stdLHSet = new LinkedHashSet<>();
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            Students std = new Students();
            std.InputStudent();
            stdLHSet.add(std);
        }
        for (Students student : stdLHSet) {
            student.DisplayStudent();
        }
        System.out.println("Nhap ma sinh vien can xoa: ");
        String studentIdToRemove = sc.nextLine();
        boolean found = false;
        Iterator<Students> iterator = stdLHSet.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (student.getStudentID().equals(studentIdToRemove)) {
                iterator.remove();
                found = true;
                System.out.println("Da xoa sinh vien co ma " + studentIdToRemove);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma " + studentIdToRemove);
        }


        // Xem lại danh sách sinh viên sau khi xóa
        System.out.println("Danh sach sinh vien sau khi xoa: ");
        for (Students student : stdLHSet) {
            student.DisplayStudent();
        }
    }
    
}
