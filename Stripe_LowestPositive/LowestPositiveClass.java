package Stripe_LowestPositive;

import java.util.Arrays;

public class LowestPositiveClass {

    public int FindLowestPositive(int[] array){

        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            if(array[i] <0){}
           else if(array[i] + 1 != array[i+1]){
                 return  array[i] +1;
            }
            else return array[array.length - 1] + 1;
        }
        return -1;
    }
}
