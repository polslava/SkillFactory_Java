abstract class Entity{

    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;
    private int agility;
    private int exp;
    private int gold;

    public Entity(String name, int force, int agility, int exp, int gold) {
        this.name = name;
        this.force = force;
        this.agility = agility;
        this.exp = exp;
        this.gold = gold;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    abstract public void attack(Entity entity);

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAgility() {
        return agility;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
}