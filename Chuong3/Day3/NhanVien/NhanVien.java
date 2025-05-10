package Chuong3.Day3.NhanVien;

public class NhanVien {
    protected String hoTen;
    protected long luong;

    public NhanVien(){

    }
    public NhanVien(String hoTen) {
        this.hoTen = hoTen;
    }
    public String loaiNhanVien() {
        return "";
        }

    public void xuatThongTin() {
        System.out.println("====Nhan Vien==== " + hoTen);
        System.out.println("=====Loai Nhan Vien=====: " + loaiNhanVien());
        System.out.println("====Luong=====: " + luong + " VND");
    }
    
}
