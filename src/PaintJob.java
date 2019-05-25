public class PaintJob
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(6.26,2.2));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets)
    {
        if(width>0 && height>0 && areaPerBucket>0 && extraBuckets>0){
            double area= width*height;
            double tbucket = areaPerBucket*extraBuckets;
            double bucket = area-tbucket;
            double Paint = bucket/areaPerBucket;
            if (Paint <= 0) {
                return 0;
            }else{
            return (int) Math.ceil(Paint);
            }
    } return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width>0 && height>0 && areaPerBucket>0)
        {
            double area=width*height;
            double paint=area/areaPerBucket;
            return (int) Math.ceil(paint);
        }
        return -1;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area>0 && areaPerBucket>0){
            double paint=area/areaPerBucket;
            return (int) Math.ceil(paint);
        }
        return -1;
    }
}
