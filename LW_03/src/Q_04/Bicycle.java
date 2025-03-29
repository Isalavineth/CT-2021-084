package Q_04;

public class Bicycle {
    Owner bicycleOwner;

    // Constructor for the bicycle class
    public Bicycle(Owner bicycleOwner) {
        this.bicycleOwner = bicycleOwner;
    }

    // Getter and setter for the bicycle owner
    public Owner getBicycleOwner() {
        return bicycleOwner;
    }

    public void setBicycleOwner(Owner bicycleOwner) {
        this.bicycleOwner = bicycleOwner;
    }
}
