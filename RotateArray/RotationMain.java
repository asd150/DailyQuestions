package RotateArray;

import java.util.Arrays;

public class RotationMain {
    public static void main(String[] args){

        Rotation rotation = new Rotation();
        int[] array = {1,2,3,4};

      int[] a =  rotation.rotate(array,2);
        System.out.println(Arrays.toString(a));

    }
}
