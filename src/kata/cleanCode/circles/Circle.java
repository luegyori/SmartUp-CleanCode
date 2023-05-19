package kata.cleanCode.circles;

/**
 * This class represents a circle.
 * A circle is a shape that has no angles.
 * Its only "side" is equidistant from the center
 * for 360 degrees (º).
 */
public class Circle {

    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }
}
