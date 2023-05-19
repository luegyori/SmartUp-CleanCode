package kata.cleanCode.triangles;


/**
 * This class represents an Isosceles triangle.
 * This type of triangle has two equal sides.
 */
public class IsoscelesTriangle {

    private Double longSides;
    private Double shortSide;


    public IsoscelesTriangle() { }

    public IsoscelesTriangle(Double longSides, Double shortSide) {
        this.longSides = longSides;
        this.shortSide = shortSide;
    }


    public Double getLongSides() {
        return longSides;
    }

    public void setLongSides(Double longSides) {
        this.longSides = longSides;
    }

    public Double getShortSide() {
        return shortSide;
    }

    public void setShortSide(Double shortSide) {
        this.shortSide = shortSide;
    }

    public Double getPerimeter() {
        return this.longSides *2 + this.shortSide;
    }
}
