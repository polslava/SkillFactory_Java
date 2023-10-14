public class GiantSnake extends Monster {

    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }

    @Override
    public void growl(){
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack(Monster monster){
        growl(true);
        super.damage(getForce()); /*подсмотрел в 7.3.2*/ /*хотя в Zombie похожий сам решил, но отличаются*/
        //super.attack(); /*так и не понял как тут исправить*/
        System.out.println("     ...and hid in the grass");
    }

}
/*не используется в тестере этот класс*/