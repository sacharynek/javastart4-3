package shapes;

public class Rectangle {

    protected double x, y;

    public Rectangle(){
        this.x = 2;
        this.y = 5;
    }

    public Rectangle(double x, double y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("boki prostokata musza byc wieksze od zera");
        }
        this.x = x;
        this.y = y;
    }

    public double rectPerimeter() {
        return 2 * this.getX() + 2* this.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
