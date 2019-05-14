package shapecalculator;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public interface IShapeCalculator {

    public double squareArea(Square square);

    public double circleArea(Circle cirle);

    public double trianglePerimeter(Triangle triangle);

    public double rectPerimeter(Rectangle rectangle);

}
