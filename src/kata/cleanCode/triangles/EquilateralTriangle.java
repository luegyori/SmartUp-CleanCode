package kata.cleanCode.triangles;

/**
    This class represents an Equilateral triangle.
    An equilateral triangle has three equal sides.
 */
public class EquilateralTriangle {

    private Double side;

    public EquilateralTriangle() { }
    public EquilateralTriangle(Double side) {
        this.side = side;
    }


    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getPerimeter() {
        return this.side*3;
    }
}
