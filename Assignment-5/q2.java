// 2. Create a class named ‘Animal’ which includes methods like eat() and sleep().
// Create a child class of Animal named ‘Bird’ and override the parent class methods.
// Add a new method named fly(). Create an instance of Animal class and invoke the eat and sleep methods using this object.
// Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

class Animal {

    String name;
    int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Bird extends Animal {

    int flyAltitude;

    public Bird(String name, int flyAltitude) {
        super(name, 2);
        this.flyAltitude = flyAltitude;
    }

    public void fly() {
        System.out.println(name + " is flying at " + flyAltitude);
    }
}

public class q2 {

    public static void main(String[] args) {
        Animal a = new Animal("Bull", 4);
        a.eat();
        a.sleep();

        Bird rob = new Bird("Robin", 400);
        rob.eat();
        rob.sleep();
        rob.fly();
    }
}
/* Output

Bull is eating
Bull is sleeping
Robin is eating
Robin is sleeping
Robin is flying at 400

*/
