// 3. WAP to create a simple class to find the area and volume of rectangle and box using super and this keyword.

class Rectangle {

    int length;
    int width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    int area() {
        return this.length * this.width;
    }
}

class Box extends Rectangle {

    int height;

    Box(int l, int w, int h) {
        super(l, w);
        this.height = h;
    }

    int volume() {
        return super.length * super.width * this.height;
    }
}

public class q3 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Box box = new Box(10, 5, 3);

        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Volume of box: " + box.volume());
    }
}
// output
// Area of rectangle: 50
// Volume of box: 150
