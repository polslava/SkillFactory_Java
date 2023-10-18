public class Rhombuses extends Quadrangle implements Figure{
    public double alpha;
    public double beta;
    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        double area;
        if(beta>alpha) {
            area = Math.pow(a,2)*Math.sin(alpha);
        } else {
            area = Math.pow(a,2)*Math.sin(beta);
        }

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
            diagonal = a * Math.sqrt(2 - 2 * Math.cos(beta));
        } else {diagonal = a * Math.sqrt(2 - 2 * Math.cos(alpha));}
        return diagonal;
    }

    @Override
    public double getHeight() {
        double height;
        if(beta>alpha) {
            height = a*Math.sin(beta);
        } else {
            height = a*Math.sin(alpha);
        }
        return height;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
