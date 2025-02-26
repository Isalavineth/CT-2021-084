package Q_09;

import java.util.*;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text; //text is the input string
        System.out.print("Enter a string: ");
        text = scanner.nextLine();
        System.out.print(text.length()+"\n"+text.charAt(0)+"\n"+text.charAt(text.length()-1));
    }
}
