package Q_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight in Kilograms: ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height in Centimeters: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height/100, 2);
        System.out.println("Your BMI is: "+df.format(bmi));
        if (bmi < 20){
            System.out.print("You are underweight.");
        } else if (bmi >= 20 && bmi < 25){
            System.out.print("You are normal weight.");
        } else{
            System.out.print("You are overweight.");
        }

    }
}
