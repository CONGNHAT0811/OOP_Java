package Chuong4.Day2;
import java.util.ArrayList;
import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        System.out.println("Nhap so luong phan tu: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int b = sc.nextInt();
            arraylist1.add(b);
        }

        int max = arraylist1.get(0);
        for (Integer item: arraylist1) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        
        System.out.println("Nhap so nguyen b: ");
        int b = sc.nextInt();
        for (int i = 0; i < arraylist1.size(); i++) {
            if (arraylist1.get(i) == b) {
                arraylist1.remove(i);
            }
        }
        System.out.println(arraylist1);

        // Xap sep mang
        arraylist1.sort((o1, o2)-> o2 - o1);
        System.out.println("Mang sau khi sap xep: " + arraylist1);}

    
}
