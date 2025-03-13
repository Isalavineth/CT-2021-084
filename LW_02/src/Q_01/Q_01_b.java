package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_b {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double x,y;
        System.out.print("Enter value for X: ");
        x = scanner.nextDouble();
        System.out.print("Enter value for Y: ");
        y = scanner.nextDouble();
        System.out.print("The square root of (X + 4Y^3) is: "+df.format(Math.sqrt(x+4*(Math.pow(y,3)))));
    }
}
