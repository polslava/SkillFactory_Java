abstract public class Quadrangle {


    public int a;
    public int b;
    public String color;
    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    abstract public double getLargeDiagonal();
    abstract public double getHeight();
    abstract public String getColor();

}
