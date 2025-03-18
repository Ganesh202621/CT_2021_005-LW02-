package Q_03;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in degrees celsius: ");
        double celsius =scanner.nextDouble();

        double Fahrenheit =(1.8*celsius)+32;

        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit%n", celsius, Fahrenheit);
        scanner.close();

    }
}
