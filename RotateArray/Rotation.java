package RotateArray;

public class Rotation {


    public int[] rotate(int[] array,int times){


            int i, temp;


            for(int j=0;j<times;j++) {
                temp = array[array.length-1];
            for (i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[i] = temp;
            }

        return array;
    }


}
