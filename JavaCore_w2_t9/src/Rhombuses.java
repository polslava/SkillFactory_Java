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
            area = Math.pow(a,2)*Math.sin(Math.toRadians(alpha));
        } else {
            area = Math.pow(a,2)*Math.sin(Math.toRadians(beta));
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
        if(this.beta>this.alpha) {
            diagonal = this.a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(this.beta)));
        } else {diagonal = this.a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(this.alpha)));}
        return diagonal;
    }

    @Override
    public double getHeight() {
        double height;
        if(this.beta>this.alpha) {
            height = this.a*Math.sin(Math.toRadians(this.beta));
        } else {
            height = this.a*Math.sin(Math.toRadians(this.alpha));
        }
        return height;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
