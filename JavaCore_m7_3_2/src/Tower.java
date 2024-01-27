public class Tower extends Entity{

    public Tower(String name) {
        super(name + " the Tower");
    }
    @Override
    public void attack(Entity entity){
        entity.damage(getForce());

    }
}