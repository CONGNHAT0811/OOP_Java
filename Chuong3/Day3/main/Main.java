package Chuong3.Day3.main;
import Chuong3.Day3.shapes.HinhTru;
import Chuong3.Day3.shapes.HinhTron;
import Chuong3.Day3.shapes.HinhVuong;
import Chuong3.Day3.shapes.HinhChuNhat;
import Chuong3.Day3.shapes.HinhHoc;


public class Main {
    public static void main(String[] args) {
        //Hình học
        HinhHoc hh = new HinhHoc();
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println("Số lượng hình học: " + HinhHoc.dem);


        //Hình Tròn
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        // Hình Trụ 
        HinhTru htr = new HinhTru();
        htr.xuatTen();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.inTheTich();

        // Hình Chữ Nhật 
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        // Hình Vuông
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }    
}
