package Chuong3.Day3.NhanVien;
import Chuong3.Day3.NhanVien.Configs;

public class PartTime extends NhanVien {
    private int gioLamViec;

    public PartTime(String hoTen, int gioLamViec) {
        this.hoTen = hoTen;
        this.gioLamViec = gioLamViec;

    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}
