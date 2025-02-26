package Q_05;

import java.text.SimpleDateFormat;
import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        System.out.println(sdf.format(date));
    }
}
