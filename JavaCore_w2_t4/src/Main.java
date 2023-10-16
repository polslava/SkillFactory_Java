public class Main {
    public static void main(String[] args){
        Car car = new Car("M");
        Car.Engine engine = car.new Engine(100);
    }
}
