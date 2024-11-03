// 3. Write a program in Java with class Rectangle with the data fields width, length, area and color.
// The length, width and area are of double type and color is of string type.
// The methods are set_length() , set_width() , set_color(), and find_area().
//  Create two object ofRectangle and compare their area and color.
// If area and color same for the objects then display “Matching Rectangles” otherwise display “Non Matching Rectangle”.

class Rectangle {

    double length;
    double width;
    double area;
    String color;

    public void set_length(double len) {
        length = len;
    }

    public void set_width(double wid) {
        width = wid;
    }

    public void set_color(String col) {
        color = col;
    }

    public void find_area() {
        area = length * width;
    }
}

class q3 {

    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.set_length(5.0);
        rect1.set_width(3.0);
        rect1.set_color("Red");
        rect1.find_area();

        rect2.set_length(5.0);
        rect2.set_width(3.0);
        rect2.set_color("Red");
        rect2.find_area();

        if (rect1.area == rect2.area && rect1.color.equals(rect2.color)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non Matching Rectangle");
        }
    }
}

// Sample Output:
// Matching Rectangles