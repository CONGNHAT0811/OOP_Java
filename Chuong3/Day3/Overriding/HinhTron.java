package Chuong3.Day3.Overriding;
import java.util.Scanner;

public class HinhTron {
    private float banKinh;
    public final float PI = 3.14f;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    
    public void nhapThongTin() {
        System.out.println("Nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        this.banKinh = sc.nextFloat();
    }
    public float tinhDienTich() {
        return PI * banKinh * banKinh;
    }
    public float tinhChuVi() {
        return 2 * PI * banKinh;
    }
    public void xuatThongTin() {
        System.out.println("Hinh tron co ban kinh: " + this.banKinh);
        System.out.println("Dien tich hinh tron: " + this.tinhDienTich());
        System.out.println("Chu vi hinh tron: " + this.tinhChuVi());
    }


    
}
