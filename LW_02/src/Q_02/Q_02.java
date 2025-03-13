package Q_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        double cm, in ,ft;
        System.out.print("Enter the length in centimeters: ");
        cm = scanner.nextDouble();
        in = cm/2.54;
        ft = Math.floor(in/12);
        System.out.print("The length in feet and inches is: "+(int)ft+" feet "+df.format(in%12)+" inches");
    }
}
