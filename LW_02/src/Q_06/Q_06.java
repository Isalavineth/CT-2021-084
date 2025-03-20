package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Year currentYear = Year.now();
        int year;
        System.out.print("Enter the year you were born: ");
        year = scanner.nextInt();
        System.out.print("You were born in "+year+" and will be(are) "+(currentYear.getValue()-year)+" this year.");
    }
}
