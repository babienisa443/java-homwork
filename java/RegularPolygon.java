
public class RegularPolygon {

    private int n;
    private double sides;
    private double x, y;

    // Constructor

    RegularPolygon() {
        this.n = 3;
        this.sides = 1;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int n, double side) {
        this.n = n;
        this.sides = side;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.sides = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return sides;
    }

    public void setSide(double sides) {
        this.sides = sides;
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

    public double getPerimeter() {
        return this.sides * this.n;
    }

    public double getArea() {
        return (this.n * this.sides * this.sides) / (4 * Math.tan(Math.PI / this.n));
    }

}
