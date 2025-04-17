package Chuong2.Day2;

import java.util.Scanner;

public class Lession2 {

    static class Student {
        String name;
        long studentID;
        int BirthDay;

        public Student(String name, long studentID, int BirthDay) {
            this.name = name;
            this.studentID = studentID;
            this.BirthDay = BirthDay;
        }

        public void displayInfo() {
            System.out.println("\n== Thông tin sinh viên ==");
            System.out.println("Họ tên: " + name);
            System.out.println("Mã sinh viên: " + studentID);
            System.out.println("Năm sinh: " + BirthDay);
        }
    }

    public static void SoSanhNumber(Scanner scanner) {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("Số nhỏ nhất là: " + a);
        } else if (a > b) {
            System.out.println("Số nhỏ nhất là: " + b);
        } else {
            System.out.println("Hai số a và b bằng nhau.");
        }
    }

    public static void sumNumber(Scanner scanner) {
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
    }

    public static void WeekNumber(Scanner scanner) {
        System.out.print("Nhập một số nguyên giới hạn từ 1 đến 7: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Thu 2");
                break;
            case 2:
                System.out.println("Thu 3");
                break;
            case 3:
                System.out.println("Thu 4");
                break;
            case 4:
                System.out.println("Thu 5");
                break;
            case 5:
                System.out.println("Thu 6");
                break;
            case 6:
                System.out.println("Thu 7");
                break;
            case 7:
                System.out.println("Chu nhat");
                break;
            default:
                System.out.println("Khong hop le");
                break;
        }
    }

    public static void LoopNumberDoWhile(Scanner scanner) {
        int sum;
        do {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();
            sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("Tổng các chữ số là: " + sum);

            if (sum >= 10) {
                System.out.println("Tổng đã lớn hơn hoặc bằng 10, dừng lại.");
            }
        } while (sum < 10);

        System.out.println("Kết thúc chương trình.");
    }

    public static void IfElseAge(Student student) {
        int currentYear = 2025;
        int age = currentYear - student.BirthDay;
        if (age < 16) {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Vị Thành Niên.");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Trưởng Thành.");
        } else if (age >= 18 && age < 30) {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Lấy Vợ.");
        } else if (age >= 30 && age < 50) {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Trung Niên.");
        } else if (age >= 50 && age < 60) {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Già.");
        } else {
            System.out.println("Bạn tên là: " + student.name + ", Ở Độ Tuổi Gần Đất Xa Trời.");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Le Cong Nhat", 2221050333L, 2003);
        student.displayInfo();
        Scanner scanner = new Scanner(System.in);
        try {
            sumNumber(scanner);
            SoSanhNumber(scanner);
            WeekNumber(scanner);
            LoopNumberDoWhile(scanner);
            IfElseAge(student);
        } finally {
            scanner.close();
        }
    }
}
