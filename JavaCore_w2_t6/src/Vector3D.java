public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }
    public double cosinus;
    public int getVectorX()
    {
        return this.x2-this.x1;
    }
    public int getVectorY(){
        return this.y2-this.y1;
    }
    public int getVectorZ(){
        return this.z2-this.z1;
    }
    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(this.getVectorX(),2) + Math.pow(this.getVectorY(),2)+ Math.pow(this.getVectorZ(),2));
    }

    @Override
    public String getVectorCords() {
        return this.getVectorX()+" "+this.getVectorY()+" "+this.getVectorZ();
    }
    public double getScalarProduct(Vector3D vector){
        return (vector.getVectorX()*this.getVectorX())+(vector.getVectorY()*this.getVectorY())+(vector.getVectorZ()*this.getVectorZ());
    }
}
