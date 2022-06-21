package controlflow.core;

public class PaintJob {

    public static void main(String[] args) {
        int returnNum = getBucketCount(3.26, 0.75);
        System.out.printf("Number to return: %d\n", returnNum);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalArea = width * height;
        double buckets = totalArea / areaPerBucket;
        System.out.printf("Buckets required: %.2f\n", buckets);
        int bucketsToBuy = (int) (buckets - extraBuckets) + 1;
        System.out.printf("Buckets to buy: %d\n", bucketsToBuy);

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width * height;
        double buckets = totalArea / areaPerBucket;
        int bucketsToBuy = (int) buckets + 1;
        return bucketsToBuy;

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double buckets = area / areaPerBucket;
        int bucketsToBuy = (int) buckets + 1;
        return bucketsToBuy;
    }
}
