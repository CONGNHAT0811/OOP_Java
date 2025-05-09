package Chuong3.Day2;

import java.util.Scanner;

public class Lession1 {
    public String tenTamGiac;
    public float canh1;
    public float canh2;
    public float canh3;
    public float chuVi;
    public float dienTich;


    // Phuong thuc 
    public void nhapThongTin(Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Nhập tên tam giác: ");
        tenTamGiac = scanner.nextLine();
        System.out.print("Nhập cạnh thứ nhất: ");
        canh1 = scanner.nextFloat();
        System.out.print("Nhập cạnh thứ hai: ");
        canh2 = scanner.nextFloat();
        System.out.print("Nhập cạnh thứ ba: ");
        canh3 = scanner.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = canh1 + canh2 + canh3;
    }

    public void xuatThongTin() {
        System.out.println("Tên tam giác: " + tenTamGiac);
        System.out.println("Cạnh 1: " + canh1);
        System.out.println("Cạnh 2: " + canh2);
        System.out.println("Cạnh 3: " + canh3);
        System.out.println("Chu vi tam giác: " + chuVi);

    }
}
