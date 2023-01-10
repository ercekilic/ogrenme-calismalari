public class Rectangle {

    public double width;
    public double lenght;

    public  Rectangle(double width,double lenght){

        this.lenght=lenght;
        this.width=width;

        if(this.lenght<0){
            this.lenght=0;
        }
        if (this.width<0){
            this.width=0;
        }
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width * lenght;
    }

    public double getLength() {
        return lenght;
    }
}
