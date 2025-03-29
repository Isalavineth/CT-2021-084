package Q_01;

public class Temperature {
    private double celsius;

    //no argument constructor
    public Temperature() {
        this.celsius = 0;
    }

    //parameterized constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    //getter method to get the value of celsius
    public double toCelsius() {
        return celsius;
    }

    //getter method to get the value of fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5 + 32);
    }

    //setter method to set the value of celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    //setter method to set the value of fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
