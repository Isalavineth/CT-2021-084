package Q_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //taking integer input 1
        System.out.print("Enter the first integer: ");
        int x = scanner.nextInt();
        //taking integer input 2
        System.out.print("Enter the second integer: ");
        int y = scanner.nextInt();
        //taking integer input 3
        System.out.print("Enter the third integer: ");
        int z = scanner.nextInt();

        int min; //smallest integer

        if(x < y) {
            if(x < z) {
                min = x; //x is the smallest
            } else {
                min = z; //z is the smallest
            }
        } else {
            if(y < z) {
                min = y; //y is the smallest
            } else {
                min = z; //z is the smallest
            }
        }

        // Print the smallest integer
        System.out.println("The smallest integer is: " + min);
    }
}
