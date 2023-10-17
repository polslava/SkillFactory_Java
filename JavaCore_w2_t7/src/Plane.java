public class Plane extends Transport{
    public Plane (int fuel, int speed){
        super(fuel, speed);
    }

    @Override
    public boolean canMove(int n) {
        if (getFuelLevel()>n)
        {
            this.fuel =this.fuel-n;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getFuelLevel() {
        return this.fuel;
    }
    public void fillFuel(int n){
        this.fuel = this.fuel+n;
    }
}
