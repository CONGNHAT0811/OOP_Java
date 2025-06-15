package Chuong5.Main;
import java.util.Scanner;
import java.util.ArrayList;

public record Test1() {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int value = sc.nextInt();
            list.add(value);
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        System.out.print("Nhap so nguyen can xoa: ");
        int a = sc.nextInt();
        if (list.contains(a)) {
            list.remove(Integer.valueOf(a));
            System.out.println("Mang sau khi xoa phan tu " + a + ": " + list);
        } else {
            System.out.println("Phan tu " + a + " khong co trong mang.");
        }
        
    }
}
