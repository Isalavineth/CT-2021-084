package Q_06;

import javax.swing.*;
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer H; // Variable to store height
        Integer W; //
        String title; //Variable to store title
        System.out.print("Enter the title of the frame: ");
        title = scanner.nextLine();
        System.out.print("Enter the height of the frame: ");
        H = scanner.nextInt();
        System.out.print("Enter the width of the frame: ");
        W = scanner.nextInt();

        JFrame frame = new JFrame(title);
        frame.setSize(W,H);
        frame.setVisible(true);


    }
}
