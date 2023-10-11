public class Monster {
    //private
    private String name;
     int damage;
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster "+this.name+" the Zombie was created");
    }


    protected void growl() {
    }

    protected void attack() {
        System.out.println("Monster "+name+" attacked with damage "+damage);
    }
}
