public class Car extends Transport{


    int maxPassengers;
    public Car(int fuel, int speed, int maxPassengers){
        super(fuel, speed); /*не понятно: зачем это?*/
        this.maxPassengers = maxPassengers;
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
    public int getMaxPassengers() {
        return maxPassengers;
    }
}
