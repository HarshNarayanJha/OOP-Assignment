//  Write a menu driven program in Java to compute the Area of minimum 4 different geometrical shapes.

import java.util.Scanner;
import java.lang.Math;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Area of: ");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Rhombus");
        System.out.print("> ");
        int opt = sc.nextInt();
        double area;

        System.out.println("");

        switch (opt) {
            case 1:
                // Square
                System.out.print("Side length: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of square with side " + side + " is " + area);
                break;

            case 2:
                // Circle
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of circle with radius " + radius + " is " + area);
                break;

            case 3:
                // Rectangle
                System.out.print("Length: ");
                double length = sc.nextDouble();
                System.out.print("Breadth: ");
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is " + area);
                break;

            case 4:
                // Rhombus
                System.out.print("Diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = sc.nextDouble();
                area = d1 * d2 / 2;
                System.out.println("Area of rhombus with diagonals " + d1 + " and " + d2 + " is " + area);
                break;

            default:
                System.out.println("Invalid choice " + opt);
                break;

        }
    }
}
