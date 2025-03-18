package Q_05;


import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();


        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();

    }

}
