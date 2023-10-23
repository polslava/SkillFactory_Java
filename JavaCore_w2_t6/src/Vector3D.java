public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(this.x1-this.x2,2) + Math.pow(this.y1-this.y2,2)+ Math.pow(this.z1-this.z2,2));
    }

    @Override
    public String getVectorCords() {
        return this.x1+", "+this.y1+", "+this.z1+", "+this.x2+", "+this.y2+", "+this.z2;
    }
    public double getScalarProduct(Vector3D vector){
        return 0;
    }
}
