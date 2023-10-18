public class Parallelogram extends Quadrangle implements Figure{
    public double alpha;
    public double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        double area;

            area = this.a*this.b*Math.sin(Math.toRadians(this.alpha));

        return area;
    }

    @Override
    public double perimeter() {
        return (this.a+this.b)*2;
    }

    @Override
    public double getLargeDiagonal() {
        double diagonal;
        if(beta>alpha) {
            diagonal = Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2) - 2 *this.a*this.b* Math.cos(Math.toRadians(this.beta)));
        } else {diagonal = Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2) - 2 *this.a*this.b* Math.cos(Math.toRadians(this.alpha)));
        }
        return diagonal;
    }

    @Override
    public double getHeight() {
        double height;
        height = this.a*Math.sin(Math.toRadians(this.alpha));

        return height;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
