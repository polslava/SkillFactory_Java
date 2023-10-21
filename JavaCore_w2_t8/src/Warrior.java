public class Warrior extends Player{
    public String armor;
    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor=armor;
    }

    @Override
    public String getFullInfo() {

        return hp+" "+level+" "+type+" "+weapon+" "+armor;
    }

    @Override
    public void levelUp() {
        this.level=this.level+1;
    }

    @Override
    public boolean doDamage() {
        return true;
    }
}
