package com.vi;

public class PaintJob {
    public static int getBucketCount(double width, double height, int areaPerBucket, double extraBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        } else {
            double WallArea = width * height;
            double bucket = WallArea / areaPerBucket;

            int bucketNeeded = (int) Math.round(bucket - extraBucket);
            return bucketNeeded;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double WallArea = width * height;
            double bucket = WallArea / areaPerBucket;

            int bucketNeeded = (int) Math.round(bucket);
            return bucketNeeded;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.round(area / areaPerBucket);
        }
    }
}

