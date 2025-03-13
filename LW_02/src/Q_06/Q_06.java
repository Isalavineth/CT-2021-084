package Q_06;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter your birth year: ");
        year = scanner.nextInt();
        System.out.print("You were born in "+year+" and will be(are) "+(2025-year)+" this year.");
    }
}
