public class ResizeableCircle extends Circle {
    ResizeableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        this.radius = this.radius + this.radius * percent / 100;
    }

}
