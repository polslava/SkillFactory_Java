public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    // Overload this method to make SCREAMS

    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    public void growl(boolean gr){
        if (gr)
        {System.out.print("RAAAAUUUGHHHH");} else
        {System.out.print("Raaaauuughhhh");}
        super.growl();
    }
    @Override
    public void attack(){
        super.attack();
        growl();
    }

}