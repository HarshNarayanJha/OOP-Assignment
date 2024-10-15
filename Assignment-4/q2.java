// 2. Create a class Box that uses a parameterized constructor to initialize the dimensions of a Box.
// (dimensions are width, height, depth of double type).
// The class should have a method that calculates and returns the volume of the Box.
// Obtain an object and print the corresponding volume in main() function.

import java.util.Scanner;

class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double volume() {
        return width * height * depth;
    }
}

class q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();

        Box box = new Box(width, height, depth);

        System.out.println("Volume: " + box.volume());
    }
}
