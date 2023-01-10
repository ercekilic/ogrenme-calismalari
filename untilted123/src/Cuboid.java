public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width,double lenght,double height){
        super(width, lenght);
        this.height=height;
        if(height<0)
            this.height=0;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
