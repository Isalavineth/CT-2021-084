package Q_10;

import java.util.*;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text; //text is the input string
        System.out.print("Enter a string: ");
        text = scanner.nextLine();
        if (text.length() % 2 == 0) {
            System.out.print("Entered string has even length."); //Prints this if the length of the string is even
        } else {
            System.out.print(text.charAt(text.length() / 2)); //Prints the middle character if the length of the string is odd
        }
    }
}
