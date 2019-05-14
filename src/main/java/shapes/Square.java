package shapes;

public class Square extends Rectangle {

    public Square(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("bok kwadratu musi byc wiekszy od zera!");
        }
        this.x = x;
        this.y = x;
    }

    public double squareArea() {
        return this.getX() * this.getY();
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }
}
