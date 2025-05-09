package Chuong3.Day1;

import java.util.Scanner;

public class HinhTron {
    final double PI = 3.14;
    String tenHinhTron;
    float banKinh;
    float chuVi;
    float dienTich;
    ToaDo toaDo;

    public void nhapThongTin(Scanner scanner) {
        System.out.println("Nhap ten hinh tron: ");
        String tenHinhTron = scanner.nextLine();
        System.out.print("Nhap ban kinh hinh tron: ");
        banKinh = scanner.nextFloat();
        System.out.print("Nhap toa do x: ");
        ToaDo toaDo = new ToaDo();
        toaDo.nhapToaDo(scanner);
    }
    

    public String inThongTinHinhTron() {
        return "Hinh tron co ten: " + tenHinhTron + "\n" +
               "Ban kinh: " + banKinh + "\n" +
               "Chu vi: " + chuVi + "\n" +
               "Dien tich: " + dienTich + "\n" +
               "Toa do: (" + toaDo.x + ", " + toaDo.y + ")";
    }
}




