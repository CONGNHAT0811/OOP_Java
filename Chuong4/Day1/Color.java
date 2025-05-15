package Chuong4.Day1;

import java.util.Scanner;

public class Color {
    private int colorId;
    private String colorName;

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void inputColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã màu: ");
        this.colorId = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên màu: ");
        this.colorName = sc.nextLine();
    }

    public void displayColor() {
        System.out.println("Mã màu: " + this.colorId);
        System.out.println("Tên màu: " + this.colorName);
    }
}
