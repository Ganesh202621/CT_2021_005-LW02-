package Q_09;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial investment amount (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (R) in %: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years (N): ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), years);
        System.out.printf("The investment will grow to: %.2f",amount);
        scanner.close();
    }
}
