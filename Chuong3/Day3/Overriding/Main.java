package Chuong3.Day3.Overriding;

public class Main {
    public static void main(String[] args) {
        // Hình tròn
        HinhTron ht = new HinhTron();
        ht.nhapThongTin();
        ht.xuatThongTin();
        System.out.println("Thông tin đối tượng hình tròn:" + ht.getClass());
        System.out.println("Thông tin đối tượng hình tròn:" + ht.getClass().getName());
        System.out.println("Thông tin đối tượng hình tròn:" + ht.getClass().getSimpleName());

        // Hình trụ
        HinhTru htr = new HinhTru();
        htr.nhapThongTin();
        htr.xuatThongTin();


        // Sinh Viên 
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.setName(null);
        sv1.setAge(20);
        System.out.println("Sinh viên 1: " + sv1.getName() + ", " + sv1.getAge());
        sv2.setName("Nguyễn Văn A");
        sv2.setAge(17);
        System.out.println("Sinh viên 2: " + sv2.getName() + ", " + sv2.getAge());
    }
}
