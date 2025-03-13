package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_c {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double x,y;
        System.out.print("Enter value for X: ");
        x = scanner.nextDouble();
        System.out.print("Enter value for Y: ");
        y = scanner.nextDouble();
        System.out.print("The cube root of the product of X and Y is: "+df.format(Math.cbrt(x*y)));
    }
}
