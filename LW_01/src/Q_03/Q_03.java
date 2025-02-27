package Q_03;

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName; // Variable to store first name
        String mName; // Variable to store middle name
        String lName; // Variable to store last name
        System.out.print("Enter your first name: ");
        fName = scanner.next();
        System.out.print("Enter your middle name: ");
        mName = scanner.next();
        System.out.print("Enter your last name: ");
        lName = scanner.next();
        System.out.println(fName+" "+mName.charAt(0)+". "+lName+".");
    }
}
