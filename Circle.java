public class Circle implements GeomatricObject {

    public static double pi = 3.1416;
    public double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * pi;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
