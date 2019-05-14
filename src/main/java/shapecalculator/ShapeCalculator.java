package shapecalculator;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public class ShapeCalculator implements IShapeCalculator {

    public double squareArea(Square square) {
        return square.getX() * square.getY();
    }

    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }

    public double trianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double rectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getX() + 2* rectangle.getY();
    }
}
