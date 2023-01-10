public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels=4;
        engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
    return getClass()+" engine is starting...";
    }
    public String accelerate(){
       return getClass()+" is accelerating...";
    }
    public String brake(){
        return getClass()+" is braking.";
    }
}
