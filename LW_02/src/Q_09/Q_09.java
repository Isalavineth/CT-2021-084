package Q_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        int p,n;
        double r;
        System.out.print("Enter the investment amount in dollars: ");
        p = scanner.nextInt();
        System.out.print("Enter the annual interest rate in percentage: ");
        r = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        n = scanner.nextInt();
        System.out.print("The amount of money earned after "+n+" years in dollars is: "+df.format(p*Math.pow(1+r/100, n)));
    }
}
