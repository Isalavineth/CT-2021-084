package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q_07 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        JFrame frame = new JFrame(sdf.format(date));
        frame.setVisible(true);
        frame.setSize(400,300);
    }
}
