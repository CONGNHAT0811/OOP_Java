package Chuong3.Day3.shapes;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float chieuDai;
    public float chieuRong;

    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = (chieuDai + chieuRong) * 2;
    }
    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
    }
}
