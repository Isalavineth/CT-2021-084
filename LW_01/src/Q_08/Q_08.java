package Q_08;

import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text; //text is the input string
        Integer exclam; //exclam is the index of the exclamation mark
        String firsttext; //firsttext is the string before the exclamation mark
        String secondtext; //secondtext is the string after the exclamation mark
        System.out.print("Enter a string: ");
        text = scanner.nextLine();
        exclam = text.indexOf("!");
        firsttext = text.substring(0,exclam);
        secondtext = text.substring(exclam+2); // +2 to skip the space after the exclamation mark
        System.out.println(firsttext+"\n"+secondtext);
    }
}
