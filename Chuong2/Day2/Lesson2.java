package Chuong2.Day2;

import java.util.Scanner;

public class Lesson2 {

    static class Student {
        String name;
        long studentID;
        int birthDay;

        public Student(String name, long studentID, int birthDay) {
            this.name = name;
            this.studentID = studentID;
            this.birthDay = birthDay;
        }

        public void displayInfo() {
            System.out.println("\n== Thông tin sinh viên ==");
            System.out.println("Họ tên: " + name);
            System.out.println("Mã sinh viên: " + studentID);
            System.out.println("Năm sinh: " + birthDay);
        }
    }

    public static void GiaThua(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
    }

    public static void calculateAverage(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Số lượng phần tử phải lớn hơn 0.");
            return;
        }

        int sum = 0;
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / n;
        System.out.println("Trung bình cộng của " + n + " số nguyên đã nhập là: " + average);
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

    public static void ArrayNumber() {
        System.out.println("20 số nguyên dương đầu tiên:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void MonthNumber(Scanner scanner) {
        System.out.print("Nhập một số nguyên giới hạn từ 1 đến 12: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println("Tháng 6");
                break;
            case 7:
                System.out.println("Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;
            default:
                System.out.println("Không hợp lệ");
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
        int age = currentYear - student.birthDay;
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
            ArrayNumber();
            SoSanhNumber(scanner);
            calculateAverage(scanner);
            MonthNumber(scanner);
            LoopNumberDoWhile(scanner);
            IfElseAge(student);
        } finally {
            scanner.close();
        }
    }
}