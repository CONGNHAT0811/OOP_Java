package Chuong2.Day1;

import java.util.Scanner;

public class Lesson1 {
    static class Student {
        String name;
        long studentID;

        public Student(String name, long studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        public void displayInfo() {
            System.out.println("\n== Thông tin sinh viên ==");
            System.out.println("Họ tên: " + name);
            System.out.println("Mã sinh viên: " + studentID);
        }
    }

    private static void performArithmeticOperations(int a, int b) {
        System.out.println("\n== Phép toán số học ==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0.");
        }
    }

    private static void performComparisonOperations(int a, int b) {
        System.out.println("\n== Phép so sánh ==");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    private static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Le Cong Nhat", 2221050333L);
        student.displayInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        performArithmeticOperations(a, b);
        performComparisonOperations(a, b);
        checkEvenOrOdd(a);
        checkEvenOrOdd(b);

        scanner.close();
    }
}
