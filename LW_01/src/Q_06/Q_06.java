package Q_06;

import javax.swing.*;
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h; // Variable to store height
        int w; // Variable to store width
        String title; //Variable to store title
        System.out.print("Enter the title of the frame: ");
        title = scanner.nextLine();
        System.out.print("Enter the height of the frame: ");
        h = scanner.nextInt();
        System.out.print("Enter the width of the frame: ");
        w = scanner.nextInt();

        JFrame frame = new JFrame(title);
        frame.setSize(w,h);
        frame.setVisible(true);


    }
}
