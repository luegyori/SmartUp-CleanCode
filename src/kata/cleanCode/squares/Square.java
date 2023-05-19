package kata.cleanCode.squares;

/**
 * This class simulates a square.
 * A square is a shape which has four
 * equal length sides, resulting in four right
 * angles.
 */
public class Square {
    private Double side;

    public Square() { }
    public Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return this.side;
    }
    public void setSide(Double side) {
        this.side = side;
    }


    public Double getArea(Double side) {
        return Math.pow(side, 2);
    }

    public Double getPerimeter() {
        return side * 4;
    }
}
