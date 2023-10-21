public abstract class Transport {
    int fuel;
    int speed;
    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }
    abstract public boolean canMove(int n);
    abstract public int getFuelLevel();

}