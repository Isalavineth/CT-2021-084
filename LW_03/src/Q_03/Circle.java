package Q_03;

public class Circle {
    private double radius;

    //constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    //getter method to get the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method to compute the area of the circle
    public double computeArea(){
        return (Math.PI * radius * radius);
    }

    //method to compute the circumference of the circle
    public double computeCircumference(){
        return (2 * Math.PI * radius);
    }
}
