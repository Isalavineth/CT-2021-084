package Q_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        double celcius, fahrenheit;
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celcius = (fahrenheit-32)*5/9;
        System.out.print("The temperature in Celsius is: "+df.format(celcius)+" C");
    }
}
