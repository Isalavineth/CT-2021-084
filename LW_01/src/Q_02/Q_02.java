package Q_02;

import javax.swing.*;
import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName; // Variable to store first name
        String lName; // Variable to store last name
        System.out.print("Enter your first name: ");
        fName = scanner.next();
        System.out.print("Enter your last name: ");
        lName = scanner.next();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setTitle(fName+" "+lName);
    }
}
