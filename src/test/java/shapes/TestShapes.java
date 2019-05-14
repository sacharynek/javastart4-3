package shapes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShapes {


    @Test
    public void squareAreaTest() {

        Square sq = new Square(2);
        Assert.assertEquals(sq.squareArea(), 2 * 2.0);

    }

    @Test
    public void circleAreaTest() {
        Circle cr = new Circle(1);
        Assert.assertEquals(cr.circleArea(), Math.PI * cr.getR() * cr.getR());
    }

    @Test
    public void trianglePerimeterTest() {
        Triangle tr = new Triangle(3, 3, 3);
        Assert.assertEquals(tr.trianglePerimeter(), 3.0 + 3.0 + 3.0);
    }

    @Test
    public void rectPerimeterTest(){
        Rectangle rct = new Rectangle(2,3);
        Assert.assertEquals(rct.rectPerimeter(), ((2*2.0)+(2*3.0)));
    }
}
