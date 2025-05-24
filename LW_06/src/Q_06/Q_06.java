package Q_06;

import java.util.ArrayList;
import java.util.Scanner;

//import necessary classes
import Q_01.Pet;
import Q_04.Dog;
import Q_04.Cat;

import static java.lang.System.exit;

public class Q_06 {
    public static void main(String[] args) {
        //create  scanner object for input
        Scanner input = new Scanner(System.in);
        //create an ArrayList to store pets
        ArrayList<Pet> petList = new ArrayList<>();
        //create an ArrayList to store Dogs
        ArrayList<Dog> dogList = new ArrayList<>();
        //create an ArrayList to store Cats
        ArrayList<Cat> catList = new ArrayList<>();
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
            //create a new Cat object based on the type
            if(type.equals("c"))
            {
                System.out.println("Enter pet coat color");
                String coatColor = input.nextLine();
                Cat cat = new Cat();
                pet = new Cat();
                //set the name of the Cat
                pet.setName(name);
                cat.setName(name);
                //set the coat color of the Cat
                cat.setCoatColor(coatColor);
                //typecasting pet object to add coatcolor
                ((Cat)pet).setCoatColor(coatColor);
                //add Cat to the cat list
                catList.add(cat);
            }
            //create a new Dog object based on the type
            else if(type.equals("d"))
            {
                System.out.println("Enter pet weight (kg)");
                double weight = input.nextDouble();
                input.nextLine(); // Consume the newline character
                pet = new Dog();
                Dog dog = new Dog();
                //set the name of the Dog
                pet.setName(name);
                dog.setName(name);
                //set the weight of the Dog
                dog.setWeight(weight);
                //typecasting pet object to add weight
                ((Dog)pet).setWeight(weight);
                //add Dog to the dog list
                dogList.add(dog);
            }
            else
            {
                System.out.println("Invalid type.");
                continue;
            }
            //add the pet to the list
            petList.add(pet);
        }
        System.out.println("List of cats");
        //print cats
        for(Pet p : petList)
        {
            if(p instanceof Cat)
                System.out.println("Name: "+p.getName()+"\tType: Cat "+"\tCoat Color: "+((Cat)p).getCoatColor());
        }

        System.out.println("\nList of dogs");
        //print dogs
        for(Pet p : petList)
        {
            if(p instanceof Dog)
                System.out.println("Name: "+p.getName()+"\tType: Dog "+"\tWeight: "+((Dog)p).getWeight()+" kg");
        }
        //Display the menu choices
        System.out.println("\n\nEnter corresponding number to perform task");
        System.out.println("1. Add Cat");
        System.out.println("2. Add Dog");
        System.out.println("3. Remove Cat");
        System.out.println("4. Remove Dog");
        System.out.println("0. Quit");
        int selection = input.nextInt();

        switch(selection){
            case 1:
                //Add a new cat to the Cat array
                System.out.println("Enter the name of the cat: ");
                input.nextLine();
                String catName = input.nextLine();
                System.out.println("Enter the coat color of the cat: ");
                String coatColor = input.nextLine();
                Cat cat = new Cat();
                cat.setName(catName);
                cat.setCoatColor(coatColor);
                catList.add(cat);
                break;
            case 2:
                //add a new dog to the Dog array
                System.out.println("Enter the name of the dog: ");
                input.nextLine();
                String dogName = input.nextLine();
                System.out.println("Enter the weight of the dog: ");
                double dogWeight = input.nextDouble();
                Dog dog = new Dog();
                dog.setName(dogName);
                dog.setWeight(dogWeight);
                dogList.add(dog);
                break;
            case 3:
                //Remove a cat from the Cat array by entering the name of the cat
                System.out.println("Enter the name of the cat to remove: ");
                input.nextLine();
                String catNameToRemove = input.nextLine();
                for (int i = 0; i < catList.size(); i++) {
                    if (catList.get(i).getName().equals(catNameToRemove)) {
                        catList.remove(i);
                        break;
                    }
                }
                break;
            case 4:
                //removing a dog from the Dog array by entering the name of the dog
                System.out.println("Enter the name of the dog to remove: ");
                input.nextLine();
                String dogNameToRemove = input.nextLine();
                for (int i = 0; i < dogList.size(); i++) {
                    if (dogList.get(i).getName().equals(dogNameToRemove)) {
                        dogList.remove(i);
                        break;
                    }
                }
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                //exit if the selection is invalid
                System.out.println("Invalid selection.");
                exit(0);
                break;
        }
        System.out.println("Updated list\n");
        //Print updated Dogs
        for (Dog d : dogList)
        {
            System.out.println("Dog Name: "+d.getName()+"\tWeight: "+d.getWeight());
        }
        //Print updated Cats
        for (Cat c : catList)
        {
            System.out.println("Cat Name: "+c.getName()+"\tCoat Color: "+c.getCoatColor());
        }

    }
}
