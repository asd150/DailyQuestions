package MoveZeros;

import java.util.Arrays;

public class MoveZerosMain {
    public static void main(String[] args){
        MoveZerosClass zerosClass = new MoveZerosClass();
        int[] array = {0,1,0,0};
        zerosClass.moveZeros(array);
        System.out.println(Arrays.toString(array));
       // System.out.println(Arrays.toString(zerosClass.temp));
    }
}

