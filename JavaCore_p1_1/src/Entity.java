public abstract class Entity implements Fighter{

    private String name;//имя
    private int force;//сила удара
    private int hp ;//здоровье
    private int agility;//ловкость удачи, от неё зависит успех атаки, сила удара может случайно *2
    private int exp;//опыт
    private int gold;//золото
    //private boolean destroyed = false;

    public Entity(String name, int force, int hp, int agility, int exp, int gold
            //, boolean destroyed
    ) {
        this.name = name; //имя сущности
        this.force = force; //сила сущности
        this.hp = hp; //очки здоровья
        this.agility = agility; // ловкость
        this.exp = exp; //опыт
        this.gold = gold; //золото
       // this.destroyed = destroyed; //уничтожен
        System.out.println("Monster " + name + " was created");
    }



    //abstract public void attack(Entity entity);
    @Override
    public int attack() {
        if (agility * 3 > (Math.random() * 100))
            return getForce(); // проверить алгоритм работы ловкости
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