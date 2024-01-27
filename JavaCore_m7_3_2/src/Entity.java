abstract class Entity {
    public String name;



    public int force;
    public int hp;
    public boolean destroyed = false;
    public Entity(String name ) {
        this.name = name;
        //this.force = force;
        //this.hp = hp;
        //System.out.println("Monster " + name + " was created");
    }
    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
    public int getForce() {
        return force;
    }

    public int getHp() {
        return hp;
    }
    abstract public void attack(Entity entity);
} 