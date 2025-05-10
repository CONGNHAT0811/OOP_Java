package Chuong3.Day3.NhanVien;

import Chuong3.Day3.NhanVien.Configs;

public class FullTime extends NhanVien {
    private int loaiNhanVien;
    private int soNgayLamThem;

    public FullTime(String hoTen, int loaiNhanVien, int soNgayLamThem) {
        this.hoTen = hoTen;
        this.loaiNhanVien = loaiNhanVien;
        this.soNgayLamThem = soNgayLamThem;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien toan thoi gian";
    }
    public void loaiChucVu(int loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
        if (loaiNhanVien == Configs.NHAN_VIEN_SEP) {
            System.out.println("====Loai Nhan Vien=====: " + "Sếp");
        } else if (loaiNhanVien == Configs.NHAN_VIEN_LINH) {
            System.out.println("====Loai Nhan Vien=====: " + "Lính");
        }
    }
    public void soNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
        System.out.println("====So Ngay Lam Them=====: " + soNgayLamThem);
    }
    public void tinhLuong() {
        if (loaiNhanVien == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + (Configs.LUONG_LAM_THEM_MOI_NGAY * soNgayLamThem);
        } else if (loaiNhanVien == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + (Configs.LUONG_LAM_THEM_MOI_NGAY * soNgayLamThem);
        }
    }
}
