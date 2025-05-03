package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of rows of the pyramid: ");
        // Read the number of rows for the pyramid
        int rows = scanner.nextInt();
        // Output the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
