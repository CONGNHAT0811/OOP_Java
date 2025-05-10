package Chuong3.Day3.shapes;
import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hinh Vuong";
    }
    public void nhapCanh() {
        System.out.print("Nhap canh: ");
        Scanner sc = new Scanner(System.in);
        chieuDai=chieuRong = sc.nextFloat();
    }
    
}
