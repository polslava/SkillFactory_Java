public abstract class Monster {
    public String getName() {
        return name;
    }

    //Fix this class
    private String name;
    private int force;

    public int getHp() {
        return hp;
    }

    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    protected void growl() {
    }
     protected abstract void attack(Monster monster);
    //{
       // System.out.println("Monster "+name+" attacked with damage "+force);
    //}
    protected boolean damage(int dhp)
    {
        hp = hp-dhp;
        if (hp<1) {
            destroyed = true;
            return destroyed;
        } else {
            destroyed=false;
            return destroyed;
        }
    }
    public boolean isDestroyed(){
        if (hp<1) {
            destroyed = true;
            return destroyed;
        } else {
            destroyed=false;
            return destroyed;
        }
    }
}
