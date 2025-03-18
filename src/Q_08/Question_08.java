package Q_08;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere(CM): ");
        double radius = scanner.nextDouble();

        double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the sphere is: %.2f",volume);
        scanner.close();
    }
}
