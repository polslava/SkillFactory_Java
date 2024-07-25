

public class Hero extends Entity implements Fighter{

    public Hero(String name, int force, int hp, int agility, int exp, int gold) {
        super(name + " the Man",
                force,  hp,  agility,  exp,  gold);
    }



}