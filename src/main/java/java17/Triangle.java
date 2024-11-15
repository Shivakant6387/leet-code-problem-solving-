package java17;

public class Triangle extends Shape {

    public Triangle(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public int calculateArea() {
        return (p1 * p2) / 2;
    }
}
