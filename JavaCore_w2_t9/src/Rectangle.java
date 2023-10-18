public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a*b;
    }
    @Override
    public double perimeter() {
        return (this.a+this.b)*2;
    }
    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2));
    }
    @Override
    public double getHeight() {
        return this.a;
    }
    @Override
    public String getColor() {
        return this.color;
    }
}
