//Interface must be here
public interface Fighter {

   /* public boolean destroyed = false;

    public default boolean isDestroyed() {
        return destroyed;
    }

    public static boolean damage(int dhp, String name, boolean destroyed) {
        //int hp = dhp;
        if (dhp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
    */

     public int attack();

    //abstract public void attack(Entity entity);

}