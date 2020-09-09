package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _function {
    public static void main(String[] args) {
        Boolean apply = isEven2.apply(1238);
        System.out.println(apply);
        boolean even = isEven(7);
        System.out.println(even);
        Boolean apply1 = isLarge.apply(9, 4);
        System.out.println(apply1);
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isEven1(int num){
        return (num%2==0)?true:false;
    }

    public static Function<Integer,Boolean> isEven2=num->(num%2==0);
    public static BiFunction<Integer,Integer,Boolean> isLarge=(num1,num2)->(num1>num2);

}
