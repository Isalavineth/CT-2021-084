package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner class object to get the input from the user
        Scanner scanner = new Scanner(System.in);
        //creating object of Temperature class
        Temperature temperature = new Temperature();

        //taking input from the user
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        //setting the value of celsius
        temperature.setCelsius(celsius);
        //displaying the temperature in Fahrenheit
        System.out.print("Temperature in Fahrenheit: " + temperature.toFahrenheit());

    }
}
