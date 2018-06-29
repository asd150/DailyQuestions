package ReverseInteger;

public class ReverseIntegerClass {


    public int reverseInteger(int num){
        boolean flag = false;
        if(num <0){
            num = -num;
            flag = true;

        }
        int remainingDigits = num;
        int currentDig =0;
        int sum =0 ;
        int count =0;
        while(remainingDigits > 0){
        count++;
        if(count == 10 && sum > Integer.MAX_VALUE/10){
            return 0;
        }
            currentDig = remainingDigits % 10;
            remainingDigits /= 10;
            sum = sum *10 + currentDig;

        }
        if(flag){
            sum = -sum;
        }

        return sum;
    }
}
