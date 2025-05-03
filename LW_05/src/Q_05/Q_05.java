package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        //Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word, phrase, number or sequence of characters:");
        // Read the input string
        String input = scanner.nextLine();
        // Call the reverseString method to reverse the input string
        String reverse = reverseString(input);

        // Check if the input is a palindrome
        if ( input.equals(reverse) ) {
            System.out.println("The input '"+input+"' is a palindrome.");
        } else
            System.out.println("The input '"+input+"' is not a palindrome.");
    }
    public static String reverseString(String input) {
        // Use recursion to reverse the string
        if (input.isEmpty())
            return input;
        else
            return reverseString(input.substring(1)) + input.charAt(0);
    }
}
