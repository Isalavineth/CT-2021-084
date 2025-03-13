package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = (celsius*1.8)+32;
        System.out.print("The temperature in Fahrenheit is: "+df.format(fahrenheit)+" F");
    }
}
