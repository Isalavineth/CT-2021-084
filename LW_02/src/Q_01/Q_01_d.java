package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_d {
    public static void main(String[] args) {
            DecimalFormat df = new DecimalFormat("#.##");
            Scanner scanner = new Scanner(System.in);
            final double PI = 3.1415926;
            double r;
            System.out.print("Enter the radius of the circle to calculate the area: ");
            r = scanner.nextDouble();
            System.out.print("The area of the circle is: "+df.format(PI*r*r));
    }
}
