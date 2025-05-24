package Q_01;

public class Q_01 {
    public static void main(String[] args) {
        //creating cat object
        Cat myCat = new Cat();
        //creating dog object
        Dog myDog = new Dog();
        //setting name for cat
        myCat.setName("Puff Puff");
        System.out.println(myCat.getName() + " says " + myCat.speak());
        //setting name for dog
        myDog.setName("Fifi");
        System.out.println(myDog.getName() + " says " + myDog.speak());
    }
}
