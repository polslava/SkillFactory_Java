abstract class Entity{
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    abstract public void attack(Entity entity);
} 