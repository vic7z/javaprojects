import java.util.*;
public class SpeedConverter{
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            int i = -1;
            return i;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        long miles=toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+"km/h "+miles+ "mi/h");
    }
}