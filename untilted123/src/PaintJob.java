public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0  || extraBuckets<0){
            return -1;
        }
        double area=0.0;
        double x=0.0;
        double y=0.0;
         area = width * height;
         x  = area / areaPerBucket;
         System.out.println(x);
         if(extraBuckets> x ) y = extraBuckets- x;
         if(extraBuckets<= x) y = x- extraBuckets;



        y= Math.ceil(y);

        int value = (int)y;


        return value;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0  ){
            return -1;
        }
        double area=0.0;
        double x;

        area = width * height;
        x  = area / areaPerBucket;
        


        x= Math.ceil(x);

        int value = (int)x;


        return value;
        

        
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area <= 0|| areaPerBucket <= 0  ){
        return -1;
    }

        double x;


        x  = area / areaPerBucket;



        x= Math.ceil(x);

        int value = (int)x;


        return value;
    }
}
