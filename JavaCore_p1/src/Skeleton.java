public abstract class Skeleton extends Entity{
    public Skeleton(String name, int force, int hp, int agility, int exp, int gold) {
        super(name + " the Skeleton",
                force,  hp,  agility,  exp,  gold);
    }
}