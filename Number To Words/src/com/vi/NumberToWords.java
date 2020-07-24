package com.vi;

public class NumberToWords {

    public static void numberToWords(int number) throws IllegalStateException {
        if(number<0){
            System.out.println("Invalid Value");
        }else {
            int digitCount=getDigitCount(number);
            int reverse=reverse(number);
            while (digitCount>0){
                int num=reverse%10;
                reverse/=10;
                digitCount--;

                switch (num){
                    case 0:
                        System.out.print("Zero\t");
                        break;
                    case 1:
                        System.out.print("One\t");
                        break;
                    case 2:
                        System.out.print("Two\t");
                        break;
                    case 3:
                        System.out.print("Three\t");
                        break;
                    case 4:
                        System.out.print("Four\t");
                        break;
                    case 5:
                        System.out.print("Five\t");
                        break;
                    case 6:
                        System.out.print("Six\t");
                        break;
                    case 7:
                        System.out.print("Seven\t");
                        break;
                    case 8:
                        System.out.print("Eight\t");
                        break;
                    case 9:
                        System.out.print("Nine\t");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + num);
                }
            }
        }
    }
    public static int reverse(int number){
      //  String rev = new StringBuilder(number).reverse().toString();
       // System.out.println(rev);
         int reverse=0;
       // System.out.println(reverse);
       // return 0;
        while (number!=0){
            int num=number%10;
            reverse*=10;
            reverse+=num;
            number/=10;
        }
        System.out.println("reverse is "+reverse);
        return reverse;

//            int reverseNum = 0;
//            int digitCountSq = (int) Math.pow(10, getDigitCount(number) - 1);
//            while (number > 0) {
//                reverseNum += (number % 10) * (digitCountSq);
//                number /= 10;
//                digitCountSq /= 10;
//            }
//            System.out.println(reverseNum);
//            return reverseNum;

        }



    public  static int getDigitCount(int number){
        int count=0;
        if(number<0){
            return -1;
        }else {
            while (number!=0){
                number/=10;
                count++;
            }
        }
        System.out.println("count "+count);
        return count;
    }
}
