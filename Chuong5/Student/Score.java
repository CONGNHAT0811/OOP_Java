package Chuong5.Student;
import java.util.Scanner;

public class Score extends Subject{
    private double ScoreA;
    private double ScoreB;
    private double ScoreC;
    private double AverageScore;



    public double getScoreA() {
        return ScoreA;
    }

    public double getScoreB() {
        return ScoreB;
    }

    public double getScoreC() {
        return ScoreC;
    }

    public void setScoreA(double scoreA) {
        this.ScoreA = scoreA;
    }

    public void setScoreB(double scoreB) {
        this.ScoreB = scoreB;
    }

    public void setScoreC(double scoreC) {
        this.ScoreC = scoreC;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem A: ");
        this.ScoreA = sc.nextDouble();
        System.out.print("Nhap diem B: ");
        this.ScoreB = sc.nextDouble();
        System.out.print("Nhap diem C: ");
        this.ScoreC = sc.nextDouble();
    }
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Diem A: " + ScoreA);
        System.out.println("Diem B: " + ScoreB);
        System.out.println("Diem C: " + ScoreC);
    }
    
    public double calculateAverageScore() {
        AverageScore = (ScoreA * 0.6 + ScoreB * 0.3 + ScoreC * 0.1);
        return AverageScore;
    }
}
