package shapecalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public class TestShapeCalculator {

    private ShapeCalculator sc;

    @BeforeClass
    public void setUp() {
        sc = new ShapeCalculator();
    }

    @Test
    public void squareAreaTest() {

        Square sq = new Square(2);
        Assert.assertEquals(sc.squareArea(sq), 2 * 2.0);

    }

    @Test
    public void circleAreaTest() {
        Circle cr = new Circle(1);
        Assert.assertEquals(sc.circleArea(cr), Math.PI * cr.getR() * cr.getR());
    }

    @Test
    public void trianglePerimeterTest() {
        Triangle tr = new Triangle(3, 3, 3);
        Assert.assertEquals(sc.trianglePerimeter(tr), 3.0 + 3.0 + 3.0);
    }

    @Test
    public void rectPerimeterTest(){
        Rectangle rct = new Rectangle(2,3);
        Assert.assertEquals(sc.rectPerimeter(rct), ((2*2.0)+(2*3.0)));
    }

}
