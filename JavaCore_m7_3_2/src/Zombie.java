public class Zombie extends  Entity{

    public Zombie(String name) {
        super(name + " the Zombie" /*, 5*/);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Entity entity){
        entity.damage(getForce());
        growl();
    }

}