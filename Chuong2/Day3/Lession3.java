package Chuong2.Day3;

import java.util.Scanner;

public class Lession3 {
    // * Lớp sinh viên */
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

    // * Nhập mảng 1 chiều */
    public static int[] input1DArray(Scanner scanner) {
        System.out.print("Nhập số lượng phần tử trong mảng 1 chiều: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử trong mảng 1 chiều:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // * Nhập mảng 2 chiều */
    public static int[][] input2DArray(Scanner scanner) {
        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng 2 chiều: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Nhập các phần tử trong mảng 2 chiều:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    // * Nhập chuỗi */
    public static String inputString(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập một chuỗi (tối đa 80 ký tự): ");
        return scanner.nextLine();
    }

    // * Tíng tổng các số chắn trong mảng 1 chiều */
    public static void process1DArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Tổng các phần tử chẵn trong mảng 1 chiều là: " + sum);
    }

    /* Sắp xếp mảng 1 chiều theo thứ tự tăng dần */
    public static void sort1DArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng 1 chiều đã sắp xếp theo thứ tự tăng dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /* Kiểm tra giá trị lớn nhất trong 2 chiều */
    public static void process2DArray(int[][] arr) {
        int maxElement = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > maxElement) {
                    maxElement = num;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: " + maxElement);
    }

    /* Đếm số ký tự thường, hoa và số trong chuỗi */
    public static void processString(String str) {
        int countLowercase = 0, countUppercase = 0, countNumber = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                countLowercase++;
            } else if (Character.isUpperCase(c)) {
                countUppercase++;
            } else if (Character.isDigit(c)) {
                countNumber++;
            }
        }
        System.out.println("Số ký tự thường: " + countLowercase);
        System.out.println("Số ký tự hoa: " + countUppercase);
        System.out.println("Số ký tự số: " + countNumber);
    }

    /* Đếm số lần xuất hiện của ký tự trong chuỗi */
    public static void countCharacterInString(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("Ký tự '" + ch + "' xuất hiện " + count + " lần trong chuỗi.");
    }

    public static void main(String[] args) {
        Student student = new Student("Lê Công Nhất", 2221050333L);
        student.displayInfo();

        Scanner scanner = new Scanner(System.in);
        try {
            int[] array1D = input1DArray(scanner);
            int[][] array2D = input2DArray(scanner);
            String inputStr = inputString(scanner);

            System.out.print("Nhập ký tự cần đếm: ");
            char ch = scanner.next().charAt(0);

            process1DArray(array1D);
            sort1DArray(array1D);
            process2DArray(array2D);
            processString(inputStr);
            countCharacterInString(inputStr, ch);
        } finally {
            scanner.close();
        }
    }
}
