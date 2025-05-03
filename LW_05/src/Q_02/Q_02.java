package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input >= 0) { //Keep reading until a negative number is entered
            System.out.println("Please enter a number: ");
            // Read the input number
            input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Negative number entered.");
                break; // Exit the loop if a negative number is entered
            }
            // Output the number of digits in the input number
            System.out.println(input + " has " + noOfDigits(input) + " digits");
        }
    }
    public static int noOfDigits(int input) {
        int count = 0;
        //Count the number of digits in the input number
        while (input > 0) {
            input /= 10;
            count++;
        }
        return count;
    }
}
