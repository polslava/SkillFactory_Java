public class Car {
    public String carModel;

    public Car(String carModel) /*конструктор создаётся без void'а*/
    {
        this.carModel=carModel;
    }
    class Engine{
        public boolean isWorking;
        public int horsepower;
        public Engine(int horsepower)  /*конструктор создаётся без void'а*/
        {
            this.horsepower = horsepower;
        }
        public String startStopEngine(){
            if (isWorking){
                isWorking = false;
                return "engine was stopped";

            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
