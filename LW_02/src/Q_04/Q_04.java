package Q_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        double calories, weight;
        System.out.print("Enter your weight in pounds: ");
        weight = scanner.nextDouble();
        calories = weight * 19;
        System.out.print("The number of calories you need is: "+df.format(calories)+" kcal");
    }
}
