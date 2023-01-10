public class Vehicle {

    private String name;
    private String size;

    public int currentVelocity;
    public int currentDirection;

    public Vehicle(String name,String size){
        this.name=name;
        this.size=size;

        this.currentDirection=0;
        this.currentVelocity=0;

    }



    public void changeVelocity(int number){
        System.out.println("selam");
        if(currentVelocity+number<0){
            currentDirection=-1;
        }
        if (currentVelocity+number==0){
            currentDirection=0;
        }
        if (currentVelocity+number>0){
            currentDirection=+1;
        }
    }






}
