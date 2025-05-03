package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        //taking the year as input
        int year = scanner.nextInt();
        // Check if year is divisible by 4 and not divisible by 100
        if (year%4 == 0 && year%100 != 0)
            System.out.println(year + " is a leap year");
        else
        {
            // Check if year is divisible by 4, 100 and 400
            if (year%4 == 0 && year%100 == 0 && year%400 == 0)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        }
    }
}
