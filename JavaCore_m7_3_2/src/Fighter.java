//Interface must be here
interface Fighter {
    public boolean destroyed = false;
    public default boolean isDestroyed() {
        return destroyed;
    }

    public default boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }


}