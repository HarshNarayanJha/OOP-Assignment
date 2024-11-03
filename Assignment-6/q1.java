// 1. WAP to design a class using Abstract methods and classes.

abstract class GunBase {

    int range;

    public GunBase(int range) {
        this.range = range;
    }

    public abstract void shoot();
}

class Rifle extends GunBase {

    public Rifle(int range) {
        super(range);
    }

    public void shoot() {
        System.out.println("Shooting at " + range);
    }
}

public class q1 {

    public static void main(String[] args) {
        GunBase rifle = new Rifle(10);
        rifle.shoot();
    }
}
/* Output

Shooting at 10

*/
