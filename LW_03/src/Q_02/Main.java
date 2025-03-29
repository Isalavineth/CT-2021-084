package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class object to get the input from the user
        Scanner scanner = new Scanner(System.in);
        //creating object of Temperature class
        Temperature temperature = new Temperature();

        //taking input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //setting the value of fahrenheit
        temperature.setFahrenheit(fahrenheit);
        //displaying the temperature in Celsius
        System.out.print("Temperature in Celsius: " + temperature.toCelsius());
    }
}
