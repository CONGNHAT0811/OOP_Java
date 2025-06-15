package Chuong3.Day1;

import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số lượng hình tròn: ");
            int n = scanner.nextInt();
            HinhTron[] HinhTrons = new HinhTron[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập hình tròn thu " + (i + 1));
                HinhTrons[i] = new HinhTron();
                HinhTrons[i].nhapThongTin(scanner);

            }
        } finally {
            scanner.close();
        }
    }
}
