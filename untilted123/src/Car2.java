public class Car2 {


    private String description;

    public Car2(String description) {

        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car2---> startEngine");

    }
    public void drive(){

        runEngine();
        System.out.println("Car2---->driving type is "+
                getClass().getSimpleName());
    }
    protected void runEngine(){

        System.out.println("Car2---> runengine");
    }
}
