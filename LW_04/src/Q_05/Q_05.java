package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Welcome to MyJava Lo-Fat Burgers---\n");
        System.out.println("\tMenu");
        System.out.println("1.Entree\n2.Side Dish\n3.Drink\n");
        System.out.println("Please choose one of the menu categories by entering number.");
        //taking the menu item as input
        int menuItem = scanner.nextInt();
        // Create arrays for entree items
        String entree[]  = {"Tofu Burger","Cajun Chicken","Buffalo wings","Rainbow Fillet"};
        // Create arrays for entree prices
        double entreePrice[] = {3.49,4.59,3.99,2.99};
        // Create arrays for side dish items
        String sideDish[] = {"Rice Cracker","No-Salt Fries","Zucchini","Brown Rice"};
        // Create arrays for side dish prices
        double sideDishPrice[] = {0.79,0.69,1.09,0.59};
        // Create arrays for drink items
        String drink[] = {"Cafe Mocha","Cafe Latte","Espresso","Oolong Tea"};
        // Create arrays for drink prices
        double drinkPrice[] = {1.99,1.90,2.49,0.99};
        int item;

        // Check the menu item and call the appropriate method
        switch (menuItem)
        {
            case 1:
                loop(entree,entreePrice);
                item = scanner.nextInt();
                output(entree,entreePrice,item);
                break;
            case 2:
                loop(sideDish,sideDishPrice);
                item = scanner.nextInt();
                output(sideDish,sideDishPrice,item);
                break;
            case 3:
                loop(drink,drinkPrice);
                item = scanner.nextInt();
                output(drink,drinkPrice,item);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    // This method displays the menu items and their prices
    public static void loop(String array[], double priceArray[])
    {
        for(int i = 0;i<4;i++)
        {
            System.out.println((i+1)+"."+array[i]+"\t\t$"+priceArray[i]);
        }
        System.out.println("\nEnter the number to add item to the order.");
    }
    // This method outputs the selected item and its price
    public static void output(String array[], double arrayPrice[], int x)
    {
        if(x > 0 && x < 5)
            System.out.println(array[x-1]+" added to the order. Total cost $"+arrayPrice[x-1]);
        else
            System.out.println("Invalid selection");
    }
}
