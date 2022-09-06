public class Circle implements GeomatricObject {

    public static double pi = 3.1416;
    public double radius = 1.0;

    public double getPerimeter() {
        return 2 * radius * pi;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
