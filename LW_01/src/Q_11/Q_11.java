package Q_11;

import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname; // Variable to store first name
        String mname; // Variable to store middle name
        String lname; // Variable to store last name
        System.out.print("Enter your first name: ");
        fname = scanner.nextLine();
        System.out.print("Enter your middle name: ");
        mname = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lname = scanner.nextLine();
        System.out.println(lname+", "+fname+" "+mname.charAt(0)+".");
    }
}
