package Chuong3.Day3.Overriding;
import java.util.Scanner;

public class HinhTru  extends HinhTron {
    private float chieuCao;

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap chieu cao hinh tru: ");
        Scanner sc = new Scanner(System.in);
        this.chieuCao = sc.nextFloat();
    }

    @Override
    public float tinhDienTich() {
        return 2 * PI * getBanKinh() * (getBanKinh() + chieuCao);
    }

    @Override
    public float tinhChuVi() {
        return 2 * PI * getBanKinh();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Hinh tru co chieu cao: " + this.chieuCao);
        System.out.println("Dien tich hinh tru: " + this.tinhDienTich());
        System.out.println("Chu vi hinh tru: " + this.tinhChuVi());
    }
    
}
