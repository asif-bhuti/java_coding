public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        ResizeableCircle resizeableCircle = new ResizeableCircle(10);

        resizeableCircle.resize(5);

        System.out.println("The perimeter of the Circle :       " + circle.getPerimeter());
        System.out.println("The Area of the Circle :            " + circle.getArea());
        System.out.println("The Perimeter of Resizable Circle : " + resizeableCircle.getPerimeter());
        System.out.println("The Area of Resizable Circle :      " + resizeableCircle.getArea());
    }

}
