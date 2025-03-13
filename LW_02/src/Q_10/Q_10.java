package Q_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;
        int loanAmount, loanPeriod;
        double annualInterestRate, monthlyPayment, totalPayment, monthlyInterestRate, numberOfPayments;
        System.out.print("Enter the loan amount: ");
        loanAmount = scanner.nextInt();
        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the loan period in years: ");
        loanPeriod = scanner.nextInt();
        monthlyInterestRate = annualInterestRate/100.0/MONTHS_IN_YEAR;
        numberOfPayments = loanPeriod*MONTHS_IN_YEAR;
        monthlyPayment = loanAmount*monthlyInterestRate/(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
        totalPayment = monthlyPayment*numberOfPayments;
        System.out.print("The monthly payment is: "+df.format(monthlyPayment)+"\nThe total payment is: "+df.format(totalPayment));
    }
}
