// 4.  Write a Java program to find the area of a Rectangle and Square using interface.

interface Shape {
    int area();
}

class Rectangle implements Shape {

    int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int area() {
        return this.l * this.b;
    }
}

class Square implements Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return this.side * this.side;
    }
}

class q4 {

    public static void main(String args[]) {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.area());
        Shape square = new Square(5);
        System.out.println(square.area());
    }
}
/* Sample Output
200
25
*/
