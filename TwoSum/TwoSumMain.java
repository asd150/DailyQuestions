package TwoSum;

import java.util.Arrays;

public class TwoSumMain {
    public static void main(String[] args){
        TwoSumClass sumClass = new TwoSumClass();
        int[] array = {4};
       int[] arr =  sumClass.twoSum(array,6);
    System.out.println(Arrays.toString(arr));
    }
}
