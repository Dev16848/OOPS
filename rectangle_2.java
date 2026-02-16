public class rectangle_2 {
    double width;
    double height;

    rectangle_2(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        rectangle_2 r1 = new rectangle_2(4, 40);
        rectangle_2 r2 = new rectangle_2(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("Rectangle 2:");
        r2.display();

        if (r1.area() > r2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.area() < r2.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
