package Chuong4.Day1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class CollSet {
    public static void main(String[] args) {
        HashSet<Shape> shp = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hinh: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Shape shape = new Shape();
            shape.input();
            shp.add(shape);
        }
        System.out.println("Danh sach hinh da nhap: ");
        for (Shape shape : shp) {
            shape.display();
        }

        // Thêm một hình mới vào hashset 
        Shape newShape = new Shape();
        newShape.input();
        if(shp.contains(newShape)) {
            System.out.println("Hinh da ton tai.");
        } else {
            shp.add(newShape);
            System.out.println("Hinh da duoc them.");
        }

        // Xóa một hình theo tên
        System.out.println("Nhap ten hinh can xoa: ");
        String nameToRemove = sc.next();
        boolean found = false;
        for (Shape shape : shp) {
            if (shape.getName().equals(nameToRemove)) {
                shp.remove(shape);
                found = true;
                System.out.println("Hinh da duoc xoa.");
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay hinh can xoa.");
        }

    }
    
}
