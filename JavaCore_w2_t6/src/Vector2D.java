public class Vector2D extends Vector{
    public Vector2D(int x1, int y1, int x2, int y2) {

        super(x1, y1, 0, x2, y2, 0);
    }
    public double cosinus;
    public int getVectorX()
    {
        return this.x2-this.x1;
    }
    public int getVectorY(){
        return this.y2-this.y1;
    }
    @Override
    public double getLength() {

        return Math.sqrt(Math.pow(this.getVectorX(),2) + Math.pow(this.getVectorY(),2));
    }

    @Override
    public String getVectorCords() {
        return (this.getVectorX())+" "+(this.getVectorY());
    }
    public double getScalarProduct(Vector2D vector){
        return (vector.getVectorX()*this.getVectorX())+(vector.getVectorY()*this.getVectorY());
    }
    public double getAngle(Vector2D vector){
        cosinus = ((this.getVectorX() * vector.getVectorX()) + (this.getVectorY() * vector.getVectorY()) ) /
            (Math.sqrt(Math.pow((this.getVectorX()),2) + Math.pow((this.getVectorY()),2 )) *
                    Math.sqrt(Math.pow((vector.getVectorX()),2) + Math.pow((vector.getVectorY()),2 )));
        if (this.getLength()!=0 && vector.getLength()!=0){
            return cosinus;}
            else
            {return -2.0;}
    }
}
