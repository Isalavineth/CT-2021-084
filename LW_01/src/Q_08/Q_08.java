package Q_08;

import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text; //text is the input string
        int exclam; //exclam is the index of the exclamation mark
        String firstText; //firsttext is the string before the exclamation mark
        String secondText; //secondtext is the string after the exclamation mark
        System.out.print("Enter a string: ");
        text = scanner.nextLine();
        exclam = text.indexOf("!");
        firstText = text.substring(0,exclam);
        secondText = text.substring(exclam+2); // +2 to skip the space after the exclamation mark
        System.out.println(firstText+"\n"+secondText);
    }
}
