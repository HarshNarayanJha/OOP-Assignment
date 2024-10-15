// 4. Write a Java Program to find the area of a rectangle, square using constructor overloading.

class Rectangle {

    double width;
    double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public Rectangle(double side) {
        width = side;
        height = side;
    }

    public double area() {
        return width * height;
    }
}

class q4 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(4);
        System.out.println("Area of rectangle: " + rect1.area());
        System.out.println("Area of square: " + rect2.area());
    }
}
