package Q_05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//import necessary classes
import Q_01.Pet;
import Q_04.Dog;
import Q_04.Cat;

public class Q_05 {
    public static void main(String[] args) {
        //create  scanner object for input
        Scanner input = new Scanner(System.in);
        //create decimal format object
        DecimalFormat df = new DecimalFormat("#.##");
        //create an ArrayList to store pets
        ArrayList<Pet> petList = new ArrayList<>();
        //create an ArrayList to store dog weight
        ArrayList<Dog> dogList = new ArrayList<>();
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
                pet = new Cat();
                //set the name of the Cat
                pet.setName(name);
                //typecasting pet object to add coatcolor
                ((Cat)pet).setCoatColor(coatColor);
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
                //typecasting pet object to add weight
                ((Dog)pet).setWeight(weight);
                //set the name of the dog for the dogList Array
                dog.setName(name);
                //set the weight of the dog for the dogList Array
                dog.setWeight(weight);
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

        double min = dogList.getFirst().getWeight();
        double max = dogList.getFirst().getWeight();
        double total = 0;
        //calculate the min, max and total weight
        for(Dog d : dogList)
        {
            double weight = d.getWeight();
            total += weight;
            if(weight < min)
                min = weight;
            if(weight > max)
                max = weight;
        }
        double avg = total / dogList.size(); //calculate average weight
        //print min, max and average weight
        System.out.println("\nDog max weight: "+max+" kg\nMin weight: "+min+" kg\nAverage weight: "+df.format(avg)+" kg");
    }

}
