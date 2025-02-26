package Q_02;

import javax.swing.*;
import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname; // Variable to store first name
        String lname; // Variable to store last name
        System.out.print("Enter your first name: ");
        fname = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lname = scanner.nextLine();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setTitle(fname+" "+lname);
    }
}
