public class Vector2D extends Vector{
    public Vector2D(int x1, int y1, int x2, int y2) {

        super(x1, y1, 0, x2, y2, 0);
    }
    public double cosinus;
    public double getVectorX(){
        return this.x2-this.x1;
    }
    public double getVectorY(){
        return this.y2-this.y1;
    }
    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(this.x1-this.x2,2) + Math.pow(this.y1-this.y2,2));
    }

    @Override
    public String getVectorCords() {
        return this.x1+", "+this.y1+", "+this.x2+", "+this.y2;
    }
    public double getScalarProduct(Vector2D vector){
        return 0;
    }
    public double getAngle(Vector2D vector){
        cosinus = ((this.x2-this.x1) * (vector.x2-vector.x1) + (this.y2-this.y1) * (vector.y2-vector.y1) ) /
            (Math.sqrt(Math.pow((this.x2-this.x1),2) + Math.pow((this.y2-this.y1),2 )) *
                    Math.sqrt(Math.pow((vector.x2-vector.x1),2) + Math.pow((vector.y2-vector.y1),2 )));
        if (this.getLength()!=0 && vector.getLength()!=0){
            return cosinus;}
            else
            {return -2.0;}
    }
}
