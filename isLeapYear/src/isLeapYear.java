public class isLeapYear {
    public static boolean isLeapYear(int year){
        final boolean b1 = false;
        final boolean b = true;
        boolean leap=false;
        if(year>=1 && year<=9999){
            if(year%4==0){

                if(year%100==0){
                    if (year%400==0){
                        leap= b;
                    }else{
                        leap= b1;
                    }
                }else{
                    leap= b;
                }
            }
        }else {
            leap= b1;
        }
        return leap;
    }

}
