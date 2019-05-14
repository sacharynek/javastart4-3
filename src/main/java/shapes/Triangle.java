package shapes;

public class Triangle {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("boki trojkota musza być wieksze od zera");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException(" podane wymiary nie sa wymiarami trojkata");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double trianglePerimeter() {
        return this.getA() + this.getB() + this.getC();
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
