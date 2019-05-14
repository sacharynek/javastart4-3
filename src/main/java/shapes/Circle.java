package shapes;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Circle {

    double r;

    public Circle(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("promień okręgu musi być większy od 0");
        }
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    /*
    double getArea(){
        throw new NotImplementedException();
    }
    double getPerimeter(){
        throw new NotImplementedException();
    }*/

}
