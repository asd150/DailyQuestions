package OnePlus;

import java.util.Arrays;

public class onePlusMain {
    public static void main(String[] args){

        onePlusClass onePlusClass = new onePlusClass();
        int[] digits = {8,9,9,9};
       System.out.println(Arrays.toString( onePlusClass.plus(digits)));

    }
}
