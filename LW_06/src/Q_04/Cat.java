package Q_04;
//import Pet class
import Q_01.Pet;

public class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String speak() {
        return " ";
    }
}