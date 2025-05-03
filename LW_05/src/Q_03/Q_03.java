package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        //Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for n: ");
        // Read the input number
        int n = scanner.nextInt();
        // Output the multiplication table for the input number
        for (int i=0; i<10; i++) {
            System.out.println(n+"x"+(i+1)+" = "+(n*(i+1)));
        }
    }
}
