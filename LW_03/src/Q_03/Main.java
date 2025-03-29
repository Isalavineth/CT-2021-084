package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double innerRadius;
        double outerRadius;

        //scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        //DecimalFormat object to format the output
        DecimalFormat df = new DecimalFormat("#.##");

        //taking inner radius value from the user
        System.out.print("Enter a value for the inner circle radius: ");
        innerRadius = scanner.nextDouble();

        //taking uter radius value from the user
        System.out.print("Enter a value for the outer circle radius: ");
        outerRadius = scanner.nextDouble();

        //creating objects of Circle class
        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        //calculating the shaded area and circumference
        double area = outerCircle.computeArea()-innerCircle.computeArea();
        double circumference = outerCircle.computeCircumference()-innerCircle.computeCircumference();

        //printing the shaded area and circumference
        System.out.print("The shaded area of the circle is: "+ df.format(area)+"\nThe shaded circumference of the circle is: "+df.format(circumference));
    }
}