package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_a {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter value for A:");
        a = scanner.nextDouble();
        System.out.print("Enter value for B:");
        b = scanner.nextDouble();
        System.out.print("Enter value for C:");
        c = scanner.nextDouble();
        System.out.print("The square root of (B^2 + 4AC) is : "+df.format(Math.sqrt(Math.pow(b,2)+4*a*c)));
    }
}
