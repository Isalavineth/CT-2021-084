package Q_04;

public class Main {
    public static void main(String[] args) {
        // Create an owner object
        Owner owner = new Owner("Isala", "0712345678");
        // Create a bicycle object
        Bicycle tomahawk = new Bicycle(owner);

        // Print the owner name of the bicycle
        System.out.println(tomahawk.getBicycleOwner().getOwnerName());
    }
}
