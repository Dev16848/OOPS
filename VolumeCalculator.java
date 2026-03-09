import java.util.Scanner;

class VolumeCalculator {

    public static double calculateVolume(double side) {
        return side * side * side;
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + calculateVolume(side));

        System.out.print("\nEnter length, width, and height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + calculateVolume(l, w, h));

        System.out.print("\nEnter radius of sphere: ");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere: " + calculateVolume(r, true));

        sc.close();
    }
}