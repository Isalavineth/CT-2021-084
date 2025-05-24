package Q_04;
//import Pet class
import Q_01.Pet;

public class Dog extends Pet {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String speak() {
        return " ";
    }
}