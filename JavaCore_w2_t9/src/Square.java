public class Square extends Quadrangle implements Figure{

    public Square(int a,  String color) {
        super(a,a, color);
    }
    public double getLargeDiagonal()
    {
        return Math.sqrt(Math.pow(this.a,2)*2);
    }
    public String getColor(){
        return this.color;
    }
    public double getHeight(){
        return this.a;
    }
    public double getArea(){
        return Math.pow(this.a,2);
    }
    public double getPerimeter(){
        return (this.a+this.b)*2;
    }

    @Override
    public double area() {
        return getArea();
    }

    @Override
    public double perimeter() {
        return getPerimeter();
    }
}
