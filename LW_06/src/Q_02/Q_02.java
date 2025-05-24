package Q_02;

import java.util.ArrayList;
import java.util.Scanner;

//import the necessary classes
import Q_01.Pet;
import Q_01.Dog;
import Q_01.Cat;

public class Q_02 {
    public static void main(String[] args) {
        //create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        //create an ArrayList to store the pets
        ArrayList<Pet> petList = new ArrayList<>();
        //create a Pet object
        Pet pet;

        while(true)
        {
            System.out.println("Enter pet name ('STOP' to stop)");
            String name = scanner.nextLine();
            //check if the user wants to stop
            if(name.equals("STOP"))
            {
                break;
            }
            System.out.println("Enter pet type ('d' for Dog and 'c' for Cat)");
            String type = scanner.nextLine();

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

        for(Pet p : petList)
        {
            System.out.print("Name: "+p.getName());
            //check the type of the pet
            if (p instanceof Dog)
                System.out.println("\tType: Dog");
            else
                System.out.println("\tType: Cat");
        }
    }
}
