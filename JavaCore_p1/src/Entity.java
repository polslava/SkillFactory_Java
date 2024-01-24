public abstract class Entity implements Fighter{

    private String name;
    private int force;
    private int hp ;
    private int agility;
    private int exp;
    private int gold;
    private boolean destroyed = false;

    public Entity(String name, int force, int hp, int agility, int exp, int gold) {
        this.name = name; //имя сущности
        this.force = force; //сила сущности
        this.hp = hp; //очки здоровья
        this.agility = agility; // ловкость
        this.exp = exp; //опыт
        this.gold = gold; //золото
        System.out.println("Monster " + name + " was created");
    }



    //abstract public void attack(Entity entity);
    @Override
    public int attack() {
        if (agility * 3 > (Math.random() * 100))
            return hp;
        else return  0;
    }
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", getName(), getHp());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}