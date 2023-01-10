public class Wall2 {
    private double width;
    private double height;
    public Wall2(){

    }
    public Wall2(double width, double height){
        if(height<0) this.height=0;
        else this.height=height;
        if(width<0) this.width=0;
        else  this.width=width;
    }
    public void setWidth(double width) {
        if(width<0) width=0;
        else{
            this.width = width;

        }
    }
    public void setHeight(double height) {
        if(height<0) {
            this.height=0;
        }
        else{
            this.height = height;
        }

    }
    public double getHeight() {

        return height;
    }
    public double getWidth() {

        return width;
    }
    public double getArea(){
        return height*width;
    }
}
