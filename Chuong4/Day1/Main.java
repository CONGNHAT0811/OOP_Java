package Chuong4.Day1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Color> linklistStudent = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong Color: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Color std = new Color();
            std.setColorId(i);
            std.setColorName("Color " + i);
            std.inputColor();
            linklistStudent.add(std);
        }
        for(int i = 0; i < linklistStudent.size(); i++) {
            System.out.println("Color thu " + (i + 1) + ": ");
            linklistStudent.get(i).displayColor();
        }
        System.out.println("Nhap so thu tu Color can xoa ");
        int index = sc.nextInt();
        if (index >= 0 && index < linklistStudent.size()) {
            linklistStudent.remove(index);
            System.out.println("Danh sach Color sau khi xoa: ");
            for (int i = 0; i < linklistStudent.size(); i++) {
                System.out.println("Color thu " + (i + 1) + ": ");
                linklistStudent.get(i).displayColor();
            }
        } else {
            System.out.println("Chi so khong hop le.");
        }

        System.out.println("Nhap ma mau can xoa: ");
        int colorIdToRemove = sc.nextInt();
        boolean found = false;
        Iterator<Color> iterator = linklistStudent.iterator();
        while (iterator.hasNext()) {
            Color color = iterator.next();
            if (color.getColorId() == colorIdToRemove) {
                iterator.remove();
                found = true;
                System.out.println("Đa xoa ma mau " + colorIdToRemove);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay mau " + colorIdToRemove);
        }

        if (linklistStudent.isEmpty()) {
            System.out.println("Danh sách Color rỗng.");
        } else {
            System.out.println("Danh sách Color không rỗng.");
        }
    }
    

}
