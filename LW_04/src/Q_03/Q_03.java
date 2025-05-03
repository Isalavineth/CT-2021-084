package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the power of 10: ");
        //taking the power of 10 as input
        int power = scanner.nextInt();

        // Check the power and print the corresponding name
        switch (power) {
            case 6:
                System.out.println("10 to the power of 6 is: Million");
                break;
            case 9:
                System.out.println("10 to the power of 9 is: Billion");
                break;
            case 12:
                System.out.println("10 to the power of 12 is: Trillion");
                break;
            case 15:
                System.out.println("10 to the power of 15 is: Quadrillion");
                break;
            case 18:
                System.out.println("10 to the power of 18 is: Quintillion");
                break;
            case 21:
                System.out.println("10 to the power of 21 is: Sextillion");
                break;
            case 30:
                System.out.println("10 to the power of 30 is: Nonillion");
                break;
            case 100:
                System.out.println("10 to the power of 100 is: Googol");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
