public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

}
/*Monster Alice the Zombie was created
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie was created
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled
Raaaauuughhhh Bob the Zombie growled */
//INHERITANCE IS THE SUPER THING!