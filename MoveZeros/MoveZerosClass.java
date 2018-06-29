package MoveZeros;

import java.util.Arrays;

public class MoveZerosClass {


    public void moveZeros(int[] array) {

        int count = 0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=0){
                array[count++] = array[i];
            }
        }

        while(count<array.length){
            array[count++] =0;
        }
    }
}