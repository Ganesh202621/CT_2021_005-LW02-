package Q_10;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        int months_in_year=12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loan_amount=scanner.nextDouble();

        System.out.print("annual interest rate: ");
        double annual_interest_rate=scanner.nextDouble();

        System.out.print("loan period: ");
        double loan_period=scanner.nextDouble();

        double monthly_interest_rate=annual_interest_rate/100.0/months_in_year;
        double number_of_payments=loan_period*months_in_year;
        double monthly_payment=(loan_amount*monthly_interest_rate)/(1-Math.pow(1/(1+monthly_interest_rate),number_of_payments));
        double total_payment=monthly_payment*number_of_payments;

        System.out.println("Monthly interest rate is :- " + monthly_interest_rate +"%");
        System.out.println("Number of payments  is :- " + number_of_payments );
        System.out.println("Monthly Payment is :- "+ monthly_payment + " rupees");
        System.out.println("Total payment is :- "+ total_payment + " rupees");
    }
}
