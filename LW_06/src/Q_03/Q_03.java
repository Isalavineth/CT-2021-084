package Q_03;

import java.util.ArrayList;
import java.util.Scanner;

//import the necessary classes
import Q_01.Pet;
import Q_01.Cat;
import Q_01.Dog;

public class Q_03 {
    public static void main(String[] args) {
        //create scanner object for input
        Scanner input = new Scanner(System.in);
        //create an ArrayList to store pets
        ArrayList<Pet> petList = new ArrayList<>();
        //create a pet object
        Pet pet;

        while(true)
        {
            System.out.println("Enter pet name ('STOP' to stop)");
            String name = input.nextLine();
            //check if the user wants to stop
            if(name.equals("STOP"))
            {
                break;
            }
            System.out.println("Enter pet type ('d' for Dog and 'c' for Cat)");
            String type = input.nextLine();
            //create a new Pet object based on the type
            if(type.equals("d"))
            {
                pet = new Dog();
            }
            else if(type.equals("c"))
            {
                pet = new Cat();
            }
            else
            {
                System.out.println("Invalid type.");
                continue;
            }
            //set the name of the pet
            pet.setName(name);
            //add the pet to the list
            petList.add(pet);
        }
        System.out.println("Names of cats");

        //print the names of cats
        for(Pet p : petList)
        {
            if(p instanceof Cat)
                System.out.println(p.getName());
        }

        System.out.println("\nNames of dogs");
        //print the names of dogs
        for(Pet p : petList)
        {
            if(p instanceof Dog)
                System.out.println(p.getName());
        }
    }
}
