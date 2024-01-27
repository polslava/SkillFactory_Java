public abstract class Monster extends Entity{
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name) {
        /*this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");*/
        super("Monster "+name + " was created");
    }

    public int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    /*protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }*/


}