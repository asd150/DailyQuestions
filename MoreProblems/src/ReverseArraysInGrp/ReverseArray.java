package ReverseArraysInGrp;

import java.util.Arrays;

public class ReverseArray {

    public void reversing(int[] array){
        int size = array.length;
        for(int i=0;i<array.length-3;i = i+3){
            swap(array,array[i],array[i+2]);

           // System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

    }

    public int[] swap(int[] array,int num1,int num2){

        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

        return array;
    }
}
