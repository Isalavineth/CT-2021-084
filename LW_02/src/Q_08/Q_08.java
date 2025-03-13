package Q_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        double volume;
        int radius;
        System.out.print("Enter the radius of the sphere to calculate the volume: ");
        radius = scanner.nextInt();
        volume = (4.0/3.0)*PI*Math.pow(radius, 3);
        System.out.print("The volume of the sphere is: "+df.format(volume));
    }
}
