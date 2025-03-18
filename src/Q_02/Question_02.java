package Q_02;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        double inches = cm/2.54;
        int feet = (int)(inches/12);
        inches = inches %12;

        System.out.printf("%.2f centimeters is equal to %d feet and %.2f inches%n", cm, feet, inches);

        scanner.close();

    }
}
