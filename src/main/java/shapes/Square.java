package shapes;

public class Square extends Rectangle {

    public Square(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("bok kwadratu musi byc wiekszy od zera!");
        }
        this.x = x;
        this.y = x;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }
}
