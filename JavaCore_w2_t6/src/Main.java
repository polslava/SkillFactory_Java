public class Main {
    public static void main (String[] args){
        Vector2D vector2D_1 = new Vector2D(1,2,3,3);
        Vector2D vector2D_2 = new Vector2D(1,3,4,4);
        System.out.println(vector2D_1.getLength());
        System.out.println(vector2D_2.getLength());
        System.out.println(vector2D_1.getVectorCords());
        System.out.println(vector2D_2.getVectorCords());
        System.out.println(vector2D_1.getAngle(vector2D_2));
        System.out.println(vector2D_1.getScalarProduct(vector2D_2));
        System.out.println();

        Vector3D vector3D_1 = new Vector3D(1,2,1, 3,3,1);
        Vector3D vector3D_2 = new Vector3D(1,3,2, 4,4,2);
        System.out.println(vector3D_1.getLength());
        System.out.println(vector3D_2.getLength());

        System.out.println(vector3D_1.getVectorCords());
        System.out.println(vector3D_2.getVectorCords());
        System.out.println(vector3D_1.getScalarProduct(vector3D_2));
    }
}
