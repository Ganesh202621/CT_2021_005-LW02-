package Q_07;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int w= scanner.nextInt();
        System.out.print("Enter your height (CM): ");
        int h= scanner.nextInt();

        double formula=(double) h/100.0;
        double BMI=(double) w / (formula*formula);

        System.out.println("Your BMI IS "+ BMI);

    }
}
