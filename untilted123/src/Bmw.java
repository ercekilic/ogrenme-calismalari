public class Bmw extends Car1 {
    public int boost;


    public Bmw(String name, String size, int handWheel,int boost) {
        super(name, size, handWheel);
        this.boost=boost;
    }

    @Override
    public void changeVelocity(int number) {
        super.changeVelocity(number);
        if(currentDirection==-1){
            System.out.println("bmw geri gidiyor");


        }
    }
}
