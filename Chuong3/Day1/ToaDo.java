package Chuong3.Day1;

import java.util.Scanner;

public class ToaDo {
    public double x;
    public double y;

    public ToaDo() {
        this.x = 0;
        this.y = 0;
    }

    public void nhapToaDo(Scanner scanner) {
        System.out.print("Nhập tọa độ x: ");
        x = scanner.nextDouble();
        System.out.print("Nhập tọa độ y: ");
        y = scanner.nextDouble();
    }
}
