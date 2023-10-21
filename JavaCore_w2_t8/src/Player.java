abstract public class Player {
    public int hp ;
    public int level ;
    public String type;
    public String weapon;
    public Player(int hp, int level, String type, String weapon){
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }
    abstract public String getFullInfo();
    abstract public void levelUp();
    abstract public boolean doDamage();

}