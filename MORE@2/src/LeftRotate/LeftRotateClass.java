package LeftRotate;

import java.util.Arrays;

public class LeftRotateClass {
    public int[] solution(int[] array,int d){
        System.out.println(array.length-1);
        while(d>0){
            int temp = array[0];
            for(int i=0;i<array.length-1;i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = temp;
           System.out.print(Arrays.toString(array));
            d--;
        }

        return array;
    }
}
