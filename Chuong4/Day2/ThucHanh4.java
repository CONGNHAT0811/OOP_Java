package Chuong4.Day2;
import java.util.HashSet;
import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        String fruit;
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Nhap so loai qua: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap loai qua thu " + (i + 1) + ": ");
            fruit = sc.nextLine();
            hashSet.add(fruit);
        }        
        System.out.println("Danh sach qua: ");
        for (String item: hashSet) {
            System.out.print(item + " ");
        }
        System.out.println("\nNhap ten loai qua can kiem tra: ");
        String checkFruit = sc.nextLine();
        if (hashSet.contains(checkFruit)) {
            System.out.println("Co loai qua " + checkFruit);
        } else {
            System.out.println("Khong co loai qua " + checkFruit);
        }
        System.out.println("Nhap ten loai qua can xoa: ");
        String removeFruit = sc.nextLine();
        if (hashSet.contains(removeFruit)) {
            hashSet.remove(removeFruit);
            System.out.println("Da xoa loai qua " + removeFruit);
        } else {
            System.out.println("Khong co loai qua " + removeFruit);
        }

        HashSet<String> hashSet1 = new HashSet<>();
        System.out.println("Nhap so loai qua ban them vao danh sach moi: ");
        int b = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            System.out.print("Nhap loai qua thu " + (i + 1) + ": ");
            fruit = sc.nextLine();
            hashSet1.add(fruit);
        }
        System.out.println("Danh sach qua moi: ");
        for (String item: hashSet1) {
            System.out.print(item + " ");
        }

        for (String item: hashSet1) {
            if (!hashSet.contains(item)) {
                hashSet.add(item);
            }
        }
        System.out.println("\nDanh sach qua sau khi them: ");
        for (String item: hashSet) {
            System.out.print(item + " ");
        } 

    }

    
}
