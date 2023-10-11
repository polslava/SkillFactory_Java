public class Monster {
     String name;
     int damage;
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


    protected void growl() {
    }

    protected void attack() {
        System.out.println("Monster "+name+" attacked with damage "+damage);
    }
}
