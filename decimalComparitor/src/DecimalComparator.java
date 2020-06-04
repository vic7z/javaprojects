public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double f1,double s1){
        if((int)(f1*1000)==(int)(s1*1000)){
            return true;
        }else{
            return false;
        }
    }
}
