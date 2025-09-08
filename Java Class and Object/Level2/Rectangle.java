package level2;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void areaRectangle() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void perimeterRectangle() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.areaRectangle();
        rect.perimeterRectangle();
    }
}

