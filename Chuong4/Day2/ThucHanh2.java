package Chuong4.Day2;
import java.util.LinkedList;
import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Nhap so luong phan tu: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int b = sc.nextInt();
            linkedList.add(b);
        }
        for(Integer item: linkedList) {
            System.out.print(item + " ");
        }
        int sum = 0;
        int count = 0;
        for (Integer item: linkedList) {
            if (item % 2 == 0) {
                sum += item;
                count++;
            }
        }
        float TBC = (float) sum / count;  
        System.out.println("\nTrung binh cong cac so chan: " + TBC);
    
    }
    
}
