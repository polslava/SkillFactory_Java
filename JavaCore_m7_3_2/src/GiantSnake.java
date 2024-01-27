public class GiantSnake extends Entity implements Fighter{

    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake");
    }


    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Entity m){
        growl();
    }

}